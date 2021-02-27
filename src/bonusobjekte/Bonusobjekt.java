package bonusobjekte;

import gameView.GameView;
import grafischeGegenstaende.RechteckigeGegenstaende;
import beweglicheGegenstaende.Ball;

import java.util.Random;


public class Bonusobjekt extends RechteckigeGegenstaende {


    protected boolean bonusInBlock;
    protected boolean bonusAktiviert;
    protected boolean bonusAusgefuehrt;
    private long aktuelleSystemzeit;
    private long fallTimer;


    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Bonusobjekt.
     * Der Konstruktor der Oberklasse RechteckigeGegenstaende wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Bonusobjekts auf der Y-Achse
     * @param positionX     Aktuelle Position des Bonusobjekts auf der X-Achse
     * @param hoehe         Hoehe des Bonusobjekts
     * @param breite        Breite des Bonusobjekts
     * @param zeichenAufbau Zeichen aus denen sich das Bonusobjekt spaeter zusammensetzt
     */
    public Bonusobjekt(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
        bonusInBlock = false;
        bonusAktiviert = false;
        bonusAusgefuehrt = false;
        zufallsauswahlBonusInBlock();

    }

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Bonusobjekt.
     * Der Konstruktor der Oberklasse RechteckigeGegenstaende wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Bonusobjekts auf der Y-Achse
     * @param positionX     Aktuelle Position des Bonusobjekts auf der X-Achse
     * @param hoehe         Hoehe des Bonusobjekts
     * @param breite        Breite des Bonusobjekts
     * @param zeichenAufbau Zeichen aus denen sich das Bonusobjekt spaeter zusammensetzt
     * @param info          Befindet sich das Objekt in der Infoleiste
     */
    public Bonusobjekt(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, Boolean info) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
        bonusInBlock = true;

    }

    /**
     * Laesst das Bonusobjekt herunterfallen
     */


    public void herunterfallen() {
        aktuelleSystemzeit = System.currentTimeMillis();
        if (aktuelleSystemzeit - fallTimer >= 7) {
            positionY += 1;
            fallTimer = aktuelleSystemzeit;
        }
    }


    /**
     * Ueberprueft eine Kollision des Bonusobjektes mit dem Schlaeger
     *
     * @param positionYSchlaeger Aktuelle Position des Schlaegers auf der Y-Achse
     * @param positionXSchlaeger Aktuelle Position des Schlaegers auf der X-Achse
     * @param hoeheSchlaeger     Hoehe des Schlaegers
     * @param breiteSchlaeger    Breite des Schlaegers
     * @return TRUE wenn das Bonusobjekt mit dem Schlaeger kollidiert ist, FALSE wenn nicht.
     */
    public boolean kollisionMitSchlaegerVerarbeiten(int positionYSchlaeger, int positionXSchlaeger, int hoeheSchlaeger, int breiteSchlaeger) {
        if ((positionY + hoehe <= positionYSchlaeger + hoeheSchlaeger && positionY + hoehe >= positionYSchlaeger && positionXSchlaeger + breiteSchlaeger >= positionX && positionXSchlaeger <= positionX + breite) && bonusAktiviert == false) {
            bonusAktiviert = true;
            grafischerGegenstand = "";
        }
        return bonusAktiviert;
    }


    private void zufallsauswahlBonusInBlock() {
        Random random = new Random();
        if (random.nextInt(4) == 1) {
            bonusInBlock = true;
        } else {
            grafischerGegenstand = "";
            positionY = 400;
        }
    }

    /**
     * @return TRUE wenn ein Bonus im Block ist, FALSE wenn nicht
     */
    public boolean getBonusInBlock() {
        return bonusInBlock;
    }

    /**
     * @param schlaegerPositionY Aktuelle Position des Schlaegers auf der Y-Achse
     * @param schlaegerPositionX Aktuelle Position des Schlaegers auf der X-Achse
     * @param ball               Das Objekt Ball mit seinen aktuellen Eigenschaften
     * @param gameView           Die Ausgabeverarbeitung des Spiels
     * @return Gibt das neu erstellte Objekt zurueck
     */
    public Object bonusAusfuehren(int schlaegerPositionY, int schlaegerPositionX, Ball ball, GameView gameView) {
        return "0";
    }

    /**
     * @param geschwindigkeit Aktuelle Geschwindigkeit des Spielflusses
     * @return Neue Geschwindigkeit des Spielflusses
     */
    public int bonusAusfuehren(int geschwindigkeit) {
        return 0;
    }

    /**
     * Setzt bonusAktiviert auf false
     */
    public void setBonusAktiviertFalse() {
        bonusAktiviert = false;
    }

    /**
     * Setzt bonusAktiviert auf True
     */
    public void setBonusAktiviertTrue() {
        bonusAktiviert = false;
    }

    /**
     * @return TRUE wenn Bonus ausgefuehrt wird und FALSE wenn nicht.
     */
    public boolean getBonusAusgefuehrt() {
        return bonusAusgefuehrt;
    }


}
