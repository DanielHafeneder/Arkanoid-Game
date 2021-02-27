package beweglicheGegenstaende;


import grafischeGegenstaende.GrafischeGegenstaende;

public class Raumschiff extends GrafischeGegenstaende {

    private String raumschiff;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Raumschiff.
     * Der Konstruktor der Oberklasse GrafischeGegenstaende wird aufgerufen.
     *
     * @param positionX Aktuelle Position des Raumschiffs auf der X-Achse
     * @param positionY Aktuelle Position des Raumschiffs auf der Y-Achse
     */
    public Raumschiff(int positionX, int positionY) {
        super(positionX, positionY);


        raumschiff =
                "   =[________]========-------[]<--\n" +
                        "     |  ___ |\n" +
                        "     |==|  ||\n" +
                        "     |==| _| |\n" +
                        "     |==||   |\n" +
                        "     |  ||   |\n" +
                        "     |  ||    |\n" +
                        "     |  ~~    |\n" +
                        "     |________|\n" +
                        "   __L________\\_\n" +
                        "  <_|_L___/   | |,\n" +
                        "     |__\\_____|_|___\n" +
                        "    /L___________   `---._________\n" +
                        "   | | .----. _  |---v--.______ _ `-------------.--.__\n" +
                        "  [| | |    |(_) |]__[_____]____________________]__ __]\n" +
                        "   | |___________|---^--'_________.-------------`--'\n" +
                        "    \\L______________.---'\n" +
                        "   __|__/_    | |\n" +
                        "  <_|_L___\\___|_|'\n" +
                        "     L________/\n" +
                        "     |        |\n" +
                        "     |   _    |\n" +
                        "     |  ||    |\n" +
                        "     |  ||   |\n" +
                        "     |==||_  |                     \n" +
                        "     |==|  | |                     \n" +
                        "     |==|__||        \n" +
                        "     |______|\n" +
                        "   =[________]========-------[]<--";
    }

    /**
     * Die Position des Raumschiffs entlang der X Achse wird erhoeht.
     * Beim Erreichen der Endposition wird die Position zurueckgesetzt.
     */
    public void bewegen() {
        positionX += 3;
        if (positionX > 170) {
            positionX = -50;
        }
    }


    /**
     * @return String bzw grafische Darstellung des Raumschiffs
     */
    public String getRaumschiff() {
        return raumschiff;
    }
}
