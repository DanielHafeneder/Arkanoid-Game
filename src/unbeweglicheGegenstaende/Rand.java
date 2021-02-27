package unbeweglicheGegenstaende;

import grafischeGegenstaende.RechteckigeGegenstaende;

public class Rand extends RechteckigeGegenstaende {

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Rand.
     * Der Konstruktor der Oberklasse RechteckigeGegenstaende wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Randes auf der Y-Achse
     * @param positionX     Aktuelle Position des Randes auf der X-Achse
     * @param hoehe         Aktuelle Hoehe des Randes
     * @param breite        Aktuelle Breite des Randes
     * @param zeichenAufbau Zeichen aus denen sich der Rand später zusammensetzt
     */
    public Rand(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
    }


}
