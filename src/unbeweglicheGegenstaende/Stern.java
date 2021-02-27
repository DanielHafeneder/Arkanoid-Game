package unbeweglicheGegenstaende;

import grafischeGegenstaende.GrafischeGegenstaende;

public class Stern extends GrafischeGegenstaende implements Cloneable {
    private String stern;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Stern.
     * Der Konstruktor der Oberklasse GrafischeGegenstaende wird aufgerufen.
     *
     * @param positionX Position des Sterns auf der X-Achse
     * @param positionY Position des Sterns auf der Y-Achse
     */
    public Stern(int positionX, int positionY) {
        super(positionX, positionY);
        stern =
                "                .\n" +
                        "               ,O,\n" +
                        "              ,OOO,\n" +
                        "        'oooooOOOOOooooo'\n" +
                        "          `OOOOOOOOOOO`\n" +
                        "            `OOOOOOO`\n" +
                        "            OOOO'OOOO\n" +
                        "           OOO'   'OOO\n" +
                        "          O'         'O";
    }

    /**
     * Klont ein Objekt vom Typ Stern
     *
     * @return Das geklonte Objekt vom Typ Stern
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @return Den String des Sterns
     */
    public String getStern() {
        return stern;
    }

}
