package unbeweglicheGegenstaende;

import gameView.GameView;
import bonusobjekte.SchlaegerGroß;
import bonusobjekte.SchlaegerKlein;
import bonusobjekte.Verlangsamung;
import bonusobjekte.Verschnellerung;

import java.awt.*;


public class Infoleiste {

    private Score score;
    private Score highscore;
    private Score scoreLeben;
    private GameView gameView;
    private String textArkanoid;
    private String textHighscore;
    private String textScore;
    private String textLife;
    private String textFast;
    private String textSlow;
    private String textBig;
    private String textSmall;
    private Rand randInfoleiste;
    private SchlaegerGroß schlaegerGroß;
    private SchlaegerKlein schlaegerKlein;
    private Verlangsamung verlangsamung;
    private Verschnellerung verschnellerung;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Infoleiste.
     *
     * @param score      Objekt Score mit seinen aktuellen Eigenschaften
     * @param highscore  Objekt highscore mit seinen aktuellen Eigenschaften
     * @param gameView   Die Ausgabeverarbeitung des Spiels
     * @param lebenScore Objekt lebenScore mit seinen aktuellen Eigenschaften
     */
    public Infoleiste(Score score, Score highscore, GameView gameView, Score lebenScore) {
        schlaegerGroß = new SchlaegerGroß(290, 450, 4, 4, "--", true);
        schlaegerKlein = new SchlaegerKlein(310, 450, 4, 4, "//", true);
        verlangsamung = new Verlangsamung(350, 450, 4, 4, "||", true);
        verschnellerung = new Verschnellerung(330, 450, 4, 4, "XX", true);

        this.gameView = gameView;
        this.score = score;
        this.highscore = highscore;
        this.scoreLeben = lebenScore;

        this.randInfoleiste = new Rand(345, 550 - 131, 15, 135, "=_");
        textArkanoid = "  ___           ___           ___           ___           ___           ___                       ___     \n" +
                "     /\\  \\         /\\  \\         /\\__\\         /\\  \\         /\\__\\         /\\  \\          ___        /\\  \\    \n" +
                "    /::\\  \\       /::\\  \\       /:/  /        /::\\  \\       /::|  |       /::\\  \\        /\\  \\      /::\\  \\   \n" +
                "   /:/\\:\\  \\     /:/\\:\\  \\     /:/__/        /:/\\:\\  \\     /:|:|  |      /:/\\:\\  \\       \\:\\  \\    /:/\\:\\  \\  \n" +
                "  /::\\~\\:\\  \\   /::\\~\\:\\  \\   /::\\__\\____   /::\\~\\:\\  \\   /:/|:|  |__   /:/  \\:\\  \\      /::\\__\\  /:/  \\:\\__\\ \n" +
                " /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:::::\\__\\ /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\ /:/__/ \\:\\__\\  __/:/\\/__/ /:/__/ \\:|__|\n" +
                " \\/__\\:\\/:/  / \\/_|::\\/:/  / \\/_|:|~~|~    \\/__\\:\\/:/  / \\/__|:|/:/  / \\:\\  \\ /:/  / /\\/:/  /    \\:\\  \\ /:/  /\n" +
                "      \\::/  /     |:|::/  /     |:|  |          \\::/  /      |:/:/  /   \\:\\  /:/  /  \\::/__/      \\:\\  /:/  / \n" +
                "      /:/  /      |:|\\/__/      |:|  |          /:/  /       |::/  /     \\:\\/:/  /    \\:\\__\\       \\:\\/:/  /  \n" +
                "     /:/  /       |:|  |        |:|  |         /:/  /        /:/  /       \\::/  /      \\/__/        \\::/__/   \n" +
                "     \\/__/         \\|__|         \\|__|         \\/__/         \\/__/         \\/__/                     ~~      ";


        textHighscore =
                "   ▄█    █▄     ▄█     ▄██████▄     ▄█    █▄       ▄████████  ▄████████  ▄██████▄     ▄████████    ▄████████ \n" +
                        "  ███    ███   ███    ███    ███   ███    ███     ███    ███ ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                        "  ███    ███   ███▌   ███    █▀    ███    ███     ███    █▀  ███    █▀  ███    ███   ███    ███   ███    █▀  \n" +
                        " ▄███▄▄▄▄███▄▄ ███▌  ▄███         ▄███▄▄▄▄███▄▄   ███        ███        ███    ███  ▄███▄▄▄▄██▀  ▄███▄▄▄     \n" +
                        "▀▀███▀▀▀▀███▀  ███▌ ▀▀███ ████▄  ▀▀███▀▀▀▀███▀  ▀███████████ ███        ███    ███ ▀▀███▀▀▀▀▀   ▀▀███▀▀▀     \n" +
                        "  ███    ███   ███    ███    ███   ███    ███            ███ ███    █▄  ███    ███ ▀███████████   ███    █▄  \n" +
                        "  ███    ███   ███    ███    ███   ███    ███      ▄█    ███ ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                        "  ███    █▀    █▀     ████████▀    ███    █▀     ▄████████▀  ████████▀   ▀██████▀    ███    ███   ██████████ \n" +
                        "                                                                                     ███    ███              ";
        textScore = "   ▄████████  ▄████████  ▄██████▄     ▄████████    ▄████████ \n" +
                "  ███    ███ ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                "  ███    █▀  ███    █▀  ███    ███   ███    ███   ███    █▀  \n" +
                "  ███        ███        ███    ███  ▄███▄▄▄▄██▀  ▄███▄▄▄     \n" +
                "▀███████████ ███        ███    ███ ▀▀███▀▀▀▀▀   ▀▀███▀▀▀     \n" +
                "         ███ ███    █▄  ███    ███ ▀███████████   ███    █▄  \n" +
                "   ▄█    ███ ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                " ▄████████▀  ████████▀   ▀██████▀    ███    ███   ██████████ \n" +
                "                                     ███    ███              ";

        textLife = "▄█        ▄█     ▄████████    ▄████████ \n" +
                "███       ███    ███    ███   ███    ███ \n" +
                "███       ███▌   ███    █▀    ███    █▀  \n" +
                "███       ███▌  ▄███▄▄▄      ▄███▄▄▄     \n" +
                "███       ███▌ ▀▀███▀▀▀     ▀▀███▀▀▀     \n" +
                "███       ███    ███          ███    █▄  \n" +
                "███▌    ▄ ███    ███          ███    ███ \n" +
                "█████▄▄██ █▀     ███          ██████████ \n" +
                "▀                                       ";

        textFast = "███████  █████  ███████ ████████ \n" +
                "██      ██   ██ ██         ██    \n" +
                "█████   ███████ ███████    ██    \n" +
                "██      ██   ██      ██    ██    \n" +
                "██      ██   ██ ███████    ██ ";

        textSlow = "███████ ██       ██████  ██     ██ \n" +
                "██      ██      ██    ██ ██     ██ \n" +
                "███████ ██      ██    ██ ██  █  ██ \n" +
                "     ██ ██      ██    ██ ██ ███ ██ \n" +
                "███████ ███████  ██████   ███ ███  \n" +
                "                                  ";
        textBig = "██████  ██  ██████  \n" +
                "██   ██ ██ ██       \n" +
                "██████  ██ ██   ███ \n" +
                "██   ██ ██ ██    ██ \n" +
                "██████  ██  ██████  \n" +
                "                   ";
        textSmall = "███████ ███    ███  █████  ██      ██      \n" +
                "██      ████  ████ ██   ██ ██      ██      \n" +
                "███████ ██ ████ ██ ███████ ██      ██      \n" +
                "     ██ ██  ██  ██ ██   ██ ██      ██      \n" +
                "███████ ██      ██ ██   ██ ███████ ███████ \n" +
                "                                           ";
    }

    /**
     * Fuegt saemtliche Elemente der Infoleiste zur Leinwand hinzu
     */
    public void zurLeinwandHinzufuegen() {


        gameView.addToCanvas(textArkanoid, 30, 440, Color.red);
        gameView.addColorStringToCanvas(randInfoleiste.getGrafischerGegenstand(), 50, randInfoleiste.getPositionX());
        gameView.addToCanvas(textHighscore, 80, 440, Color.red);
        for (int i = 0; i < highscore.getScoreGrafisch().length; i++) {
            gameView.addColorStringToCanvas(highscore.getScoreGrafisch()[i], 100, 450 + (i * 15));
        }

        gameView.addColorStringToCanvas(randInfoleiste.getGrafischerGegenstand(), 120, randInfoleiste.getPositionX());

        gameView.addToCanvas(textScore, 150, 440, Color.red);
        for (int i = 0; i < scoreLeben.getScoreGrafisch().length; i++) {
            gameView.addColorStringToCanvas(scoreLeben.getScoreGrafisch()[i], 240, 450 + (i * 15));
        }


        gameView.addToCanvas(textLife, 220, 440, Color.red);

        for (int i = 0; i < score.getScoreGrafisch().length; i++) {
            gameView.addColorStringToCanvas(score.getScoreGrafisch()[i], 170, 450 + (i * 15));
        }

        gameView.addColorStringToCanvas(randInfoleiste.getGrafischerGegenstand(), 190, randInfoleiste.getPositionX());
        gameView.addColorStringToCanvas(randInfoleiste.getGrafischerGegenstand(), 260, randInfoleiste.getPositionX());
        gameView.addColorStringToCanvas(schlaegerGroß.getGrafischerGegenstand(), schlaegerGroß.getPositionY(), schlaegerGroß.getPositionX());
        gameView.addColorStringToCanvas(schlaegerKlein.getGrafischerGegenstand(), schlaegerKlein.getPositionY(), schlaegerKlein.getPositionX());
        gameView.addColorStringToCanvas(verlangsamung.getGrafischerGegenstand(), verlangsamung.getPositionY(), verlangsamung.getPositionX());
        gameView.addColorStringToCanvas(verschnellerung.getGrafischerGegenstand(), verschnellerung.getPositionY(), verschnellerung.getPositionX());
        gameView.addToCanvas(textFast, 329, 460, Color.red);
        gameView.addToCanvas(textSlow, 349, 460, Color.red);
        gameView.addToCanvas(textBig, 289, 460, Color.red);
        gameView.addToCanvas(textSmall, 309, 460, Color.red);
    }

}
