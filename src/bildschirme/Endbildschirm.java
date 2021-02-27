package bildschirme;

import gameView.GameView;
import interfaces.TastenAuswertbar;
import unbeweglicheGegenstaende.Score;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Endbildschirm extends Benutzerbildschirm implements TastenAuswertbar {

    private Score score;
    private Score highscore;
    private String textCongratulations;
    private String textNeuerHighscore;
    private String textKeinHighscore;
    private String textGameOver;
    private StringBuilder stringBuilder;
    private boolean endbildschirmAnzeigen;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse EndBildschirm.
     * Der Konstruktor der Oberklasse Benutzerbildschirm wird aufgerufen.
     *
     * @param gameView  Die Ausgabeverarbeitung des Spiels
     * @param score     Der aktuelle Score den der Spieler erreicht hat
     * @param highscore Der aktuelle höchste Score der im Spiel erreicht wurde
     */
    public Endbildschirm(GameView gameView, Score score, Score highscore) {
        super(gameView);
        this.gameView = gameView;
        this.score = score;
        this.highscore = highscore;
        endbildschirmAnzeigen = true;
        textCongratulations =
                "    ▄████████  ▄██████▄  ███▄▄▄▄      ▄██████▄     ▄████████    ▄████████     ███     ███    █▄   ▄█          ▄████████     ███      ▄█   ▄██████▄  ███▄▄▄▄      ▄████████ \n" +
                        "   ███    ███ ███    ███ ███▀▀▀██▄   ███    ███   ███    ███   ███    ███ ▀█████████▄ ███    ███ ███         ███    ███ ▀█████████▄ ███  ███    ███ ███▀▀▀██▄   ███    ███ \n" +
                        "   ███    █▀  ███    ███ ███   ███   ███    █▀    ███    ███   ███    ███    ▀███▀▀██ ███    ███ ███         ███    ███    ▀███▀▀██ ███▌ ███    ███ ███   ███   ███    █▀  \n" +
                        "   ███        ███    ███ ███   ███  ▄███         ▄███▄▄▄▄██▀   ███    ███     ███   ▀ ███    ███ ███         ███    ███     ███   ▀ ███▌ ███    ███ ███   ███   ███        \n" +
                        "   ███        ███    ███ ███   ███ ▀▀███ ████▄  ▀▀███▀▀▀▀▀   ▀███████████     ███     ███    ███ ███       ▀███████████     ███     ███▌ ███    ███ ███   ███ ▀███████████ \n" +
                        "   ███    █▄  ███    ███ ███   ███   ███    ███ ▀███████████   ███    ███     ███     ███    ███ ███         ███    ███     ███     ███  ███    ███ ███   ███          ███ \n" +
                        "   ███    ███ ███    ███ ███   ███   ███    ███   ███    ███   ███    ███     ███     ███    ███ ███▌    ▄   ███    ███     ███     ███  ███    ███ ███   ███    ▄█    ███ \n" +
                        "   ████████▀   ▀██████▀   ▀█   █▀    ████████▀    ███    ███   ███    █▀     ▄████▀   ████████▀  █████▄▄██   ███    █▀     ▄████▀   █▀    ▀██████▀   ▀█   █▀   ▄████████▀  \n" +
                        "                                                  ███    ███                                     ▀                                                                        \n\n\n\n\n\n";
        textNeuerHighscore =
                "       ██    ██  ██████  ██    ██ ██████      ███    ██ ███████ ██     ██     ██   ██ ██  ██████  ██   ██ ███████  ██████  ██████  ██████  ███████    \n" +
                        "        ██  ██  ██    ██ ██    ██ ██   ██     ████   ██ ██      ██     ██     ██   ██ ██ ██       ██   ██ ██      ██      ██    ██ ██   ██ ██      ██ \n" +
                        "         ████   ██    ██ ██    ██ ██████      ██ ██  ██ █████   ██  █  ██     ███████ ██ ██   ███ ███████ ███████ ██      ██    ██ ██████  █████      \n" +
                        "          ██    ██    ██ ██    ██ ██   ██     ██  ██ ██ ██      ██ ███ ██     ██   ██ ██ ██    ██ ██   ██      ██ ██      ██    ██ ██   ██ ██      ██ \n" +
                        "          ██     ██████   ██████  ██   ██     ██   ████ ███████  ███ ███      ██   ██ ██  ██████  ██   ██ ███████  ██████  ██████  ██   ██ ███████   \n\n\n\n\n\n";

        textKeinHighscore =
                "                                          ██    ██  ██████  ██    ██ ██████      ███████  ██████  ██████  ██████  ███████    \n" +
                        "                                           ██  ██  ██    ██ ██    ██ ██   ██     ██      ██      ██    ██ ██   ██ ██      ██ \n" +
                        "                                            ████   ██    ██ ██    ██ ██████      ███████ ██      ██    ██ ██████  █████      \n" +
                        "                                             ██    ██    ██ ██    ██ ██   ██          ██ ██      ██    ██ ██   ██ ██      ██ \n" +
                        "                                             ██     ██████   ██████  ██   ██     ███████  ██████  ██████  ██   ██ ███████  ";

        textGameOver =
                "                                    ▄██████▄     ▄████████   ▄▄▄▄███▄▄▄▄      ▄████████       ▄██████▄   ▄█    █▄     ▄████████    ▄████████ \n" +
                        "                                   ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███      ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                        "                                   ███    █▀    ███    ███ ███   ███   ███   ███    █▀       ███    ███ ███    ███   ███    █▀    ███    ███ \n" +
                        "                                  ▄███          ███    ███ ███   ███   ███  ▄███▄▄▄          ███    ███ ███    ███  ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                        "                                 ▀▀███ ████▄  ▀███████████ ███   ███   ███ ▀▀███▀▀▀          ███    ███ ███    ███ ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                        "                                   ███    ███   ███    ███ ███   ███   ███   ███    █▄       ███    ███ ███    ███   ███    █▄  ▀███████████ \n" +
                        "                                   ███    ███   ███    ███ ███   ███   ███   ███    ███      ███    ███ ███    ███   ███    ███   ███    ███ \n" +
                        "                                   ████████▀    ███    █▀   ▀█   ███   █▀    ██████████       ▀██████▀   ▀██████▀    ██████████   ███    ███ \n" +
                        "                                                                                                                                   ███    ███\n\n\n\n\n";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bildschirmStarten() {
        endbildschirmAnzeigen = true;
        endbildschirmDrucken();
        this.soundAusgeben();
        do {
            tastenAuswerten();
        }
        while (endbildschirmAnzeigen);
        gameView.clearCanvas();
    }

    /**
     * Es wird ueberprueft ob die Enter Taste gedrueckt wurde.
     */
    @Override
    public void tastenAuswerten() {
        {
            Integer[] gedruekteTasten = gameView.getKeyCodesOfCurrentlyPressedKeys();
            if (gedruekteTasten.length > 0) {
                for (int keyCode : gedruekteTasten) {
                    if (keyCode == KeyEvent.VK_ENTER) {
                        endbildschirmAnzeigen = false;
                    }
                }
            }
        }
    }


    private Boolean aufNeuenHighscorePruefen() {
        if (score.compareTo(highscore) > 0) {
            return true;
        }
        return false;
    }

    private String stringZusammensetzen() {
        stringBuilder = new StringBuilder();
        stringBuilder.append(textGameOver);
        if (aufNeuenHighscorePruefen()) {
            stringBuilder.append(textCongratulations);
            stringBuilder.append(textNeuerHighscore);
        } else {
            stringBuilder.append(textKeinHighscore);
        }
        return stringBuilder.toString();
    }

    private void soundAusgeben() {

        if (aufNeuenHighscorePruefen()) {
            gameView.playSound("newhighscore.wav", false);


        }
        if (score.checkGewinnerScore()) {
            gameView.playSound("youwon.wav", true);

        } else if (aufNeuenHighscorePruefen() == false) {
            gameView.playSound("fail.wav", false);
        }
    }

    private void endbildschirmDrucken() {
        for (int i = 0; i < score.getScoreGrafisch().length; i++) {
            gameView.addColorStringToCanvas(score.getScoreGrafisch()[i], 50, 70 + (i * 15));
        }


        gameView.addToCanvas(this.stringZusammensetzen(), 5, 0, Color.red);
        gameView.addToCanvas(textEnter, 80, 1, Color.red);
        gameView.printCanvas();
    }
}
