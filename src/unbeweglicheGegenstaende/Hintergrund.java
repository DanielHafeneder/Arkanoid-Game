package unbeweglicheGegenstaende;

import grafischeGegenstaende.GrafischeGegenstaende;

public class Hintergrund extends GrafischeGegenstaende {
    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Hintergrund.
     * Der Konstruktor der Oberklasse GrafischeGegenstaende wird aufgerufen.
     *
     * @param positionY        Position des Hintergrundes auf der Y-Achse
     * @param positionX        Position des Hintergrundes auf der X-Achse
     * @param hintergrundArray Array mit Elementen aus denen sich der Hintergrund zusammensetzt
     */
    public Hintergrund(int positionY, int positionX, String[] hintergrundArray) {
        super(positionX, positionY);
        hintergrundErstellen(hintergrundArray);
    }


    private void hintergrundErstellen(String[] array) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        grafischerGegenstand = sb.toString();
    }
}
