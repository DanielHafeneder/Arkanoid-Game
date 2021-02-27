package bonusobjekte;

import gameView.GameView;
import beweglicheGegenstaende.Ball;
import beweglicheGegenstaende.Schlaeger;

public class SchlaegerKlein extends Bonusobjekt {
    private Schlaeger schlaegerKlein;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse SchlaegerKlein.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts SchlaegerKlein auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts SchlaegerKlein auf der X-Achse
     * @param hoehe         Hoehe des Objekts SchlaegerKlein
     * @param breite        Breite des Objekts SchlaegerKlein
     * @param zeichenAufbau Zeichen aus denen sich das SchlaegerKlein Objekt spaeter zusammensetzt
     */
    public SchlaegerKlein(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
    }

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse SchlaegerKlein.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts SchlaegerKlein auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts SchlaegerGroß auf der X-Achse
     * @param hoehe         Hoehe des Objekts SchlaegerKlein
     * @param breite        Breite des Objekts SchlaegerKlein
     * @param zeichenAufbau Zeichen aus denen sich das SchlaegerKlein Objekt spaeter zusammensetzt
     * @param info          Befindet sich das Objekt in der Infoleiste
     */
    public SchlaegerKlein(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, Boolean info) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau, info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object bonusAusfuehren(int schlaegerPositionY, int schlaegerPositionX, Ball ball, GameView gameView) {
        schlaegerKlein = new Schlaeger(schlaegerPositionY, schlaegerPositionX, 10, 40, "L▓", gameView, ball);


        return schlaegerKlein;

    }
}

