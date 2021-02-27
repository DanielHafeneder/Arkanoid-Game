package bonusobjekte;

import gameView.GameView;
import beweglicheGegenstaende.Ball;
import beweglicheGegenstaende.Schlaeger;


public class SchlaegerGroß extends Bonusobjekt {
    private Schlaeger schlaegerGroß;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse SchlaegerGroß.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts SchlaegerGroß auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts SchlaegerGroß auf der X-Achse
     * @param hoehe         Hoehe des Objekts SchlaegerGroß
     * @param breite        Breite des Objekts SchlaegerGroß
     * @param zeichenAufbau Zeichen aus denen sich das SchlaegerGroß Objekt spaeter zusammensetzt
     */
    public SchlaegerGroß(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
    }

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse SchlaegerGroß.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts SchlaegerGroß auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts SchlaegerGroß auf der X-Achse
     * @param hoehe         Hoehe des Objekts SchlaegerGroß
     * @param breite        Breite des Objekts SchlaegerGroß
     * @param zeichenAufbau Zeichen aus denen sich das SchlaegerGroß Objekt spaeter zusammensetzt
     * @param info          Befindet sich das Objekt in der Infoleiste
     */
    public SchlaegerGroß(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, boolean info) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau, info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schlaeger bonusAusfuehren(int schlaegerPositionY, int schlaegerPositionX, Ball ball, GameView gameView) {
        if (schlaegerPositionX >= 339) {
            schlaegerPositionX = 339;
        }
        schlaegerGroß = new Schlaeger(schlaegerPositionY, schlaegerPositionX, 10, 80, "L▓", gameView, ball);
        return schlaegerGroß;
    }
}
