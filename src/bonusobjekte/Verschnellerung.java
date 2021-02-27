package bonusobjekte;

public class Verschnellerung extends Bonusobjekt {
    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Verschnellerung.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts Verschnellerung auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts Verschnellerung auf der X-Achse
     * @param hoehe         Hoehe des Objekts Verschnellerung
     * @param breite        Breite des Objekts Verschnellerung
     * @param zeichenAufbau Zeichen aus denen sich das Objekt Verlangsamung spaeter zusammensetzt
     */
    public Verschnellerung(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
    }

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Verschnellerung.
     * Der Konstruktor der Oberklasse Bonusobjekt wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objekts Verschnellerung auf der Y-Achse
     * @param positionX     Aktuelle Position des Objekts Verschnellerung auf der X-Achse
     * @param hoehe         Hoehe des Objekts Verschnellerung
     * @param breite        Breite des Objekts Verschnellerung
     * @param zeichenAufbau Zeichen aus denen sich das Objekt Verschnellerung spaeter zusammensetzt
     * @param info          Befindet sich das Objekt in der Infoleiste
     */
    public Verschnellerung(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, boolean info) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau, info);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int bonusAusfuehren(int geschwindigkeit) {
        if (geschwindigkeit > 9 && bonusAusgefuehrt == false) {
            bonusAusgefuehrt = true;
            return 9;
        } else {
            bonusAusgefuehrt = true;
            return 6;
        }
    }
}
