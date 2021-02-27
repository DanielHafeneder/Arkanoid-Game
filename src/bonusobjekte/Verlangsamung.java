package bonusobjekte;

public class Verlangsamung extends Bonusobjekt {
    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Verlangsamung.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts Verlangsamung auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts Verlangsamung auf der X-Achse
     * @param hoehe         Hoehe des Objekts Verlangsamung
     * @param breite        Breite des Objekts Verlangsamung
     * @param zeichenAufbau Zeichen aus denen sich das Objekt Verlangsamung spaeter zusammensetzt
     */
    public Verlangsamung(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
    }

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Verlangsamung.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts Verlangsamung auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts Verlangsamung auf der X-Achse
     * @param hoehe         Hoehe des Objekts Verlangsamung
     * @param breite        Breite des Objekts Verlangsamung
     * @param zeichenAufbau Zeichen aus denen sich das Objekt Verlangsamung spaeter zusammensetzt
     * @param info          Befindet sich das Objekt in der Infoleiste
     */
    public Verlangsamung(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, boolean info) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau, info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int bonusAusfuehren(int geschwindigkeit) {
        if (geschwindigkeit < 9 && bonusAusgefuehrt == false) {
            bonusAusgefuehrt = true;

            return 9;
        } else {
            bonusAusgefuehrt = true;
            return 12;
        }
    }
}
