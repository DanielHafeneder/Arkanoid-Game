package grafischeGegenstaende;

import grafischeGegenstaende.GrafischeGegenstaende;

public class RechteckigeGegenstaende extends GrafischeGegenstaende {

    protected int hoehe;
    protected int breite;
    private String zeichenAufbau;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse RechteckigeGegenstaende.
     * Der Konstruktor der Oberklasse GrafischeGegenstaende wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Objektes auf der Y-Achse
     * @param positionX     Aktuelle Position des Objektes auf der X-Achse
     * @param hoehe         Aktuelle Hoehe des Objektes
     * @param breite        Aktuelle Breite des Objektes
     * @param zeichenAufbau Zeichen aus denen sich das Objekt später zusammensetzt
     */
    public RechteckigeGegenstaende(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionX, positionY);
        this.hoehe = hoehe;
        this.breite = breite;
        this.zeichenAufbau = zeichenAufbau;
        this.grafischerGegenstand = "";
        this.gegenstandErstellen();
    }


    /**
     * Der Gegenstand wird abhängig von der Höhe und Breite des Objektes rechteckig aufgebaut.
     */
    public void gegenstandErstellen() {
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite / 2; j++) {
                grafischerGegenstand = grafischerGegenstand + zeichenAufbau;
            }
            grafischerGegenstand = grafischerGegenstand + "\n";
        }
    }

    /**
     * @return Breite des Objektes
     */
    public int getBreite() {
        return breite;
    }

    /**
     * @return Hoehe des Objektes
     */
    public int getHoehe() {
        return hoehe;
    }


}
