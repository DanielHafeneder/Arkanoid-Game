package unbeweglicheGegenstaende;

import grafischeGegenstaende.RechteckigeGegenstaende;
import bonusobjekte.*;

import java.util.Random;

public class Block extends RechteckigeGegenstaende {
    private int leben;
    private boolean amLeben;
    private Bonusobjekt bonusobjekt;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Block.
     * Der Konstruktor der Oberklasse RechteckigeGegenstaende wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Blocks auf der Y-Achse
     * @param positionX     Aktuelle Position des Blocks auf der X-Achse
     * @param hoehe         Aktuelle Hoehe des Blocks
     * @param breite        Aktuelle Breite des Blocks
     * @param zeichenAufbau Zeichen aus denen sich der Block später zusammensetzt
     * @param leben         Anzahl der Leben die der Block besitzt
     */
    public Block(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, int leben) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
        this.leben = leben;
        amLeben = true;
        this.zufaelligeBonusVerteilung();

    }

    /**
     * Reduziert das Leben des Blocks
     * Wenn die Leben auf 0 sind wird der Block deaktiviert
     */
    public void lebenReduzieren() {
        leben -= 1;

        if (leben == 0) {
            grafischerGegenstand = "";
            amLeben = false;
        }
    }

    /**
     * @return Anzahl an Leben des Blockes
     */
    public int getLeben() {
        return leben;
    }

    private void zufaelligeBonusVerteilung() {
        int zufallsZahl;
        Random random = new Random();
        zufallsZahl = random.nextInt(4);
        switch (zufallsZahl) {
            case 0:
                bonusobjekt = new Verlangsamung(positionY, positionX, 4, 4, "||");
                break;


            case 1:
                bonusobjekt = new SchlaegerKlein(positionY, positionX, 4, 4, "//");
                break;

            case 2:
                bonusobjekt = new SchlaegerGroß(positionY, positionX, 4, 4, "--");
                break;

            case 3:
                bonusobjekt = new Verschnellerung(positionY, positionX, 4, 4, "XX");
                break;

        }

    }

    /**
     * @return Das zum Block gehoerige Bonusobjekt
     */
    public Bonusobjekt getBonusobjekt() {
        return bonusobjekt;
    }

    /**
     * Laesst das Bonusobjekt aus dem Block fallen
     */
    public void bonusAusBlockFallen() {
        if (leben == 0 && bonusobjekt.getBonusInBlock() == true) {
            bonusobjekt.herunterfallen();
        }
    }

    /**
     * @return TRUE wenn der Block am Leben ist und FALSE wenn nicht
     */
    public boolean getAmLeben() {
        return amLeben;
    }


}
