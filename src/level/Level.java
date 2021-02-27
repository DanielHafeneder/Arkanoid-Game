package level;

import gameView.GameView;
import beweglicheGegenstaende.Ball;
import beweglicheGegenstaende.Schlaeger;
import bonusobjekte.*;
import unbeweglicheGegenstaende.*;

import java.awt.*;
import java.util.ArrayList;

public class Level {
    protected Hintergrund hintergrund;
    private Schlaeger schlaeger;
    private Ball ball;
    protected ArrayList<Block> blockListe;
    private Rand randLinks, randRechts, randOben;
    private GameView gameView;
    private Infoleiste infoleiste;
    private long letzteAnzeige;
    private Bonusobjekt bonusobjekt;
    private int geschwindigkeit;
    private Score score;
    private Score highscore;
    private Score scoreLeben;
    private int leben;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Level.
     *
     * @param gameView  Die Ausgabeverarbeitung des Spiels
     * @param ZEILEN    Anzahl der Zeilen des Spiels
     * @param SPALTEN   Anzahl der Spalten des Spiels
     * @param score     Der aktuelle Score den der Spieler erreicht hat
     * @param highscore Der aktuelle höchste Score der im Spiel erreicht wurde
     * @param leben     Anzahl der Leben die man im Level besitzen soll
     */
    public Level(GameView gameView, int ZEILEN, int SPALTEN, Score score, Score highscore, int leben) {
        this.gameView = gameView;
        this.ball = new Ball(20, 150, 4, 4, "%%");
        this.schlaeger = new Schlaeger(ZEILEN - 20, SPALTEN / 2, 10, 60, "L▓", gameView, ball);
        this.randLinks = new Rand(0, 0, ZEILEN, 20, "=_");
        this.randOben = new Rand(0, 20, 20, SPALTEN, "=_");
        this.randRechts = new Rand(0, SPALTEN - 131, ZEILEN, 20, "=_");
        this.score = score;
        this.highscore = highscore;
        this.leben = leben;
        this.scoreLeben = new Score(leben);
        infoleiste = new Infoleiste(score, highscore, gameView, scoreLeben);
        geschwindigkeit = 9;
        gameView.changeResolution(360, 550);
    }

    /**
     * Startet das Level indem Bonusobjekte, Kollisionen und Tastendrücke ausgewertet werden und das Level grafisch dargestellt wird.
     * Das Level wird beendet wenn keine Blöcke mehr vorhanden sind, oder der Spieler keine Leben mehr besitzt.
     */
    public void levelSpielen() {
        do {
            bonusObjekteAuswerten();
            kollisionenAuswerten();
            grafischDarstellen();
            schlaeger.tastenAuswerten();
        }
        while (bloeckeAufLebenUeberprüfen() && getAmLeben());
    }

    /**
     * Das Level wird aufgebaut indem Blöcke in der levelspezifischen Reihenfolge angeordnet werden
     */
    public void aufbauLevel() {
    }

    private void grafischDarstellen() {
        gameView.addToCanvas(hintergrund.getGrafischerGegenstand(), hintergrund.getPositionY(), hintergrund.getPositionX(), Color.red);
        gameView.addColorStringToCanvas(randLinks.getGrafischerGegenstand(), randLinks.getPositionY(), randLinks.getPositionX());
        gameView.addColorStringToCanvas(randRechts.getGrafischerGegenstand(), randRechts.getPositionY(), randRechts.getPositionX());
        gameView.addColorStringToCanvas(randOben.getGrafischerGegenstand(), randOben.getPositionY(), randOben.getPositionX());
        gameView.addColorStringToCanvas(schlaeger.getGrafischerGegenstand(), schlaeger.getPositionY(), schlaeger.getPositionX());
        gameView.addColorStringToCanvas(ball.getGrafischerGegenstand(), ball.getPositionY(), ball.getPositionX());

        for (Block b : blockListe) {
            gameView.addColorStringToCanvas(b.getBonusobjekt().getGrafischerGegenstand(), b.getBonusobjekt().getPositionY(), b.getBonusobjekt().getPositionX());
            gameView.addColorStringToCanvas(b.getGrafischerGegenstand(), b.getPositionY(), b.getPositionX());
        }
        infoleiste.zurLeinwandHinzufuegen();
        gameView.printCanvas();
        gameView.clearCanvas();
    }


    private void bonusObjekteAuswerten() {
        for (Block b : blockListe) {
            b.bonusAusBlockFallen();

            if (b.getBonusobjekt().kollisionMitSchlaegerVerarbeiten(schlaeger.getPositionY(), schlaeger.getPositionX(), schlaeger.getHoehe(), schlaeger.getBreite()) == true) {
                bonusobjekt = b.getBonusobjekt();
                bonusobjekt.setBonusAktiviertFalse();
                b.getBonusobjekt().setBonusAktiviertTrue();
            }
        }

        if ((bonusobjekt instanceof SchlaegerGroß || bonusobjekt instanceof SchlaegerKlein) && bonusobjekt.getBonusAusgefuehrt() == false) {
            schlaeger = (Schlaeger) bonusobjekt.bonusAusfuehren(schlaeger.getPositionY(), schlaeger.getPositionX(), ball, gameView);
            bonusobjekt = null;
        }

        if ((bonusobjekt instanceof Verschnellerung || bonusobjekt instanceof Verlangsamung) && bonusobjekt.getBonusAusgefuehrt() == false) {
            geschwindigkeit = bonusobjekt.bonusAusfuehren(geschwindigkeit);
            bonusobjekt = null;
        }
    }

    private void kollisionenAuswerten() {
        long now = System.currentTimeMillis();

        if (now - letzteAnzeige >= geschwindigkeit) {

            ball.kollisionMitRandVerarbeiten();
            if (ball.kollisionMitSchlaegerVerarbeiten(schlaeger.getPositionY(), schlaeger.getPositionX(), schlaeger.getHoehe(), schlaeger.getBreite())) {
                gameView.playSound("beep1.wav", false);
            }
            letzteAnzeige = now;
            for (Block b : blockListe) {
                if (b.getLeben() > 0) {
                    if (ball.kollisionMitBlockVerarbeiten(b)) {
                        score.scoreZaehlerErhoehen();
                        b.lebenReduzieren();
                        if (b.getLeben() == 0) {
                            gameView.playSound("explode.wav", false);
                        } else {
                            gameView.playSound("beep2.wav", false);
                        }
                    }
                }
            }
            ball.bewegen(schlaeger.getPositionY(), schlaeger.getPositionX(), schlaeger.getBreite());
            if (ball.getPositionY() > 360) {
                lebenReduzieren();
                scoreLeben.setScoreZaehler(leben);
                gameView.playSound("soundnegative.wav", false);
                ball.setKlebenAmSchlaegerTrue();
            }
        }
    }

    private boolean bloeckeAufLebenUeberprüfen() {
        boolean levelLäuft = true;
        for (Block b : blockListe) {
            if (b.getAmLeben()) {
                levelLäuft = true;
                break;
            } else levelLäuft = false;
        }
        return levelLäuft;
    }

    private void lebenReduzieren() {
        leben -= 1;
    }

    /**
     * Ueberprueft ob der Spieler noch Leben uebrig hat
     *
     * @return TRUE, wenn Leben uebrig ist und FALSE wenn nicht.
     */
    public boolean getAmLeben() {
        if (leben > 0) {
            return true;
        } else return false;
    }
}
