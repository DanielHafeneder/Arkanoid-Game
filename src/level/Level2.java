package level;

import gameView.GameView;
import unbeweglicheGegenstaende.*;

import java.awt.*;
import java.util.ArrayList;

public class Level2 extends Level {


    private Skelett skelett = new Skelett(0, 0);
    private Totenkopf totenkopf = new Totenkopf(0, 0);
    private GameView gameView;
    private String[] hintergrundArray;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Level2.
     * Der Konstruktor der Oberklasse Level wird aufgerufen.
     *
     * @param gameView  Die Ausgabeverarbeitung des Spiels
     * @param ZEILEN    Anzahl der Zeilen des Spiels
     * @param SPALTEN   Anzahl der Spalten des Spiels
     * @param score     Der aktuelle Score den der Spieler erreicht hat
     * @param highscore Der aktuelle höchste Score der im Spiel erreicht wurde
     * @param leben     Anzahl der Leben die man im Level besitzen soll
     */
    public Level2(GameView gameView, int ZEILEN, int SPALTEN, Score score, Score highscore, int leben) {
        super(gameView, ZEILEN, SPALTEN, score, highscore, leben);
        blockListe = new ArrayList<>();
        hintergrundArray = new String[]{skelett.getGrafischerGegenstand(), totenkopf.getGrafischerGegenstand()};
        this.hintergrund = new Hintergrund(140, 40, hintergrundArray);
        this.gameView = gameView;
        gameView.setDefaultBackgroundColor(Color.black);
        this.gameView.stopAllSounds();
        this.gameView.playSound("A_bit_of_hope.wav", true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void aufbauLevel() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == 6 || j == 12) {
                    blockListe.add(new Block(30 + i * 11, 20 + j * 25, 10, 24, "**", 1));
                } else if (j == 1 || j == 7 || j == 13) {
                    blockListe.add(new Block(30 + i * 11, 20 + j * 25, 10, 24, "VV", 1));
                } else if (j == 2 || j == 8 || j == 14) {
                    blockListe.add(new Block(30 + i * 11, 20 + j * 25, 10, 24, "--", 1));
                } else if (j == 3 || j == 9 || j == 15) {
                    blockListe.add(new Block(30 + i * 11, 20 + j * 25, 10, 24, "//", 1));
                } else if (j == 4 || j == 10) {
                    blockListe.add(new Block(30 + i * 11, 20 + j * 25, 10, 24, "XX", 1));
                } else if (j == 5 || j == 11) {
                    blockListe.add(new Block(30 + i * 11, 20 + j * 25, 10, 24, "YY", 1));
                }
            }
        }

        for (int k = 0; k < 15; k++) {
            blockListe.add(new Block(195, 20 + k * 25, 10, 24, "$|", 3));
        }
        blockListe.add(new Block(195, 395, 10, 24, "//", 1));
    }
}
