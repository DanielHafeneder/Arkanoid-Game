package unbeweglicheGegenstaende;

public class Score implements Comparable {
    private String[] scoreGrafisch;
    private int scoreZaehler;
    private String zero;
    private String eins;
    private String zwei;
    private String drei;
    private String vier;
    private String fuenf;
    private String sechs;
    private String sieben;
    private String acht;
    private String neun;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Rand.
     *
     * @param scoreZaehler Wert auf den der Counter beim Anlegen gesetzt werden soll
     */
    public Score(int scoreZaehler) {
        this.scoreZaehler = scoreZaehler;
        zero =
                "  ▄▄▄▄▄▄▄▄▄  \n" +
                        " ▐░░░░░░░░░▌ \n" +
                        "▐░█░█▀▀▀▀▀█░▌\n" +
                        "▐░▌▐░▌    ▐░▌\n" +
                        "▐░▌ ▐░▌   ▐░▌\n" +
                        "▐░▌  ▐░▌  ▐░▌\n" +
                        "▐░▌   ▐░▌ ▐░▌\n" +
                        "▐░▌    ▐░▌▐░▌\n" +
                        "▐░█▄▄▄▄▄█░█░▌\n" +
                        " ▐░░░░░░░░░▌ \n" +
                        "  ▀▀▀▀▀▀▀▀▀ ";
        eins = "    ▄▄▄▄     \n" +
                "  ▄█░░░░▌    \n" +
                " ▐░░▌▐░░▌    \n" +
                "  ▀▀ ▐░░▌    \n" +
                "     ▐░░▌    \n" +
                "     ▐░░▌    \n" +
                "     ▐░░▌    \n" +
                "     ▐░░▌    \n" +
                " ▄▄▄▄█░░█▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀ ";

        zwei = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "          ▐░▌\n" +
                "          ▐░▌\n" +
                " ▄▄▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀▀▀ \n" +
                "▐░█▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀";

        drei = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "          ▐░▌\n" +
                " ▄▄▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "          ▐░▌\n" +
                " ▄▄▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀";
        vier = " ▄         ▄ \n" +
                "▐░▌       ▐░▌\n" +
                "▐░▌       ▐░▌\n" +
                "▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "          ▐░▌\n" +
                "          ▐░▌\n" +
                "          ▐░▌\n" +
                "           ▀ ";
        fuenf = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀▀▀ \n" +
                "▐░█▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "          ▐░▌\n" +
                "          ▐░▌\n" +
                " ▄▄▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀ ";
        sechs = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀▀▀ \n" +
                "▐░▌          \n" +
                "▐░█▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀";
        sieben = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "         ▐░▌ \n" +
                "        ▐░▌  \n" +
                "       ▐░▌   \n" +
                "      ▐░▌    \n" +
                "     ▐░▌     \n" +
                "    ▐░▌      \n" +
                "   ▐░▌       \n" +
                "    ▀     ";
        acht = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄█░▌\n" +
                " ▐░░░░░░░░░▌ \n" +
                "▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀ ";

        neun = " ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌\n" +
                "          ▐░▌\n" +
                " ▄▄▄▄▄▄▄▄▄█░▌\n" +
                "▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀";

    }

    private void scoreBerechnen() {
        scoreGrafisch = new String[String.valueOf(scoreZaehler).length()];
        int rechenVariable = scoreZaehler;
        for (int i = String.valueOf(scoreZaehler).length() - 1; i >= 0; i--) {
            switch (rechenVariable % 10) {
                case 0:
                    scoreGrafisch[i] = zero;
                    break;
                case 1:
                    scoreGrafisch[i] = eins;
                    break;
                case 2:
                    scoreGrafisch[i] = zwei;
                    break;
                case 3:
                    scoreGrafisch[i] = drei;
                    break;
                case 4:
                    scoreGrafisch[i] = vier;
                    break;
                case 5:
                    scoreGrafisch[i] = fuenf;
                    break;
                case 6:
                    scoreGrafisch[i] = sechs;
                    break;
                case 7:
                    scoreGrafisch[i] = sieben;
                    break;
                case 8:
                    scoreGrafisch[i] = acht;
                    break;
                case 9:
                    scoreGrafisch[i] = neun;
                    break;
            }
            rechenVariable = rechenVariable / 10;

        }
    }

    /**
     * Berechnet den Score und gibt ihn zurueck
     *
     * @return Aktueller String des Counters
     */
    public String[] getScoreGrafisch() {
        scoreBerechnen();
        return scoreGrafisch;

    }

    /**
     * Erhoeht Counter um 1
     */
    public void scoreZaehlerErhoehen() {
        scoreZaehler += 1;
    }

    /**
     * @return Aktueller Zahlenwert des Counters
     */
    public int getScoreZaehler() {
        return scoreZaehler;
    }

    /**
     * Setzt Counter auf eine bestimmte Zahl
     *
     * @param zahl Die Zahl die der Counter annehmen soll
     */
    public void setScoreZaehler(int zahl) {
        scoreZaehler = zahl;
    }

    /**
     * Vergleicht zwei Score Objekte miteinander
     *
     * @param o ein weiteres Score Objekt
     * @return Die Differenz der Counterwerte der Score Objekte
     */
    @Override
    public int compareTo(Object o) {
        Score comp = (Score) o;
        return scoreZaehler - comp.scoreZaehler;
    }

    /**
     * Ueberprueft, ob der hoechstmoegliche Score erreicht wurde
     *
     * @return TRUE wenn der hoechstmoegliche Score erreicht wurde, FALSE wenn nicht.
     */
    public boolean checkGewinnerScore() {
        if (scoreGrafisch.length == 3) {
            if (scoreGrafisch[0].equals(zwei) && scoreGrafisch[1].equals(neun) && scoreGrafisch[2].equals(vier)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
