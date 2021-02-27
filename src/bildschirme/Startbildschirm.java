package bildschirme;

import gameView.GameView;
import beweglicheGegenstaende.Raumschiff;
import interfaces.TastenAuswertbar;
import unbeweglicheGegenstaende.Stern;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Startbildschirm extends Benutzerbildschirm implements TastenAuswertbar {
    private String textArkanoid;
    private GameView gameView;
    private Color farbe;
    private Raumschiff raumschiff;
    private boolean startbildschirmAnzeigen;
    private Stern stern;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse StartBildschirm.
     * Der Konstruktor der Oberklasse Benutzerbildschirm wird aufgerufen.
     *
     * @param gameView Die Ausgabeverarbeitung des Spiels
     */
    public Startbildschirm(GameView gameView) {
        super(gameView);
        this.gameView = gameView;
        this.gameView.stopAllSounds();
        this.gameView.playSound("menu.wav", true);
        raumschiff = new Raumschiff(0, 21);
        startbildschirmAnzeigen = true;
        stern = new Stern(50, 80);

        textArkanoid =
                "                       _____        ___________       ______   _______     _____        _____    _____           ____       ____________  ____________    \n" +
                        "                     /      |_      \\          \\     |\\     \\  \\      \\  /      |_     |\\    \\   \\    \\      ____\\_  \\__   /            \\ \\           \\   \n" +
                        "                    /         \\      \\    /\\    \\     \\\\     \\  |     /|/         \\     \\\\    \\   |    |    /     /     \\ |\\___/\\  \\\\___/| \\           \\  \n" +
                        "                   |     /\\    \\      |   \\_\\    |     \\|     |/     //|     /\\    \\     \\\\    \\  |    |   /     /\\      | \\|____\\  \\___|/  |    /\\     | \n" +
                        "                   |    |  |    \\     |      ___/       |     |_____// |    |  |    \\     \\|    \\ |    |  |     |  |     |       |  |       |   |  |    | \n" +
                        "                   |     \\/      \\    |      \\  ____    |     |\\     \\ |     \\/      \\     |     \\|    |  |     |  |     |  __  /   / __    |    \\/     | \n" +
                        "                   |\\      /\\     \\  /     /\\ \\/    \\  /     /|\\|     ||\\      /\\     \\   /     /\\      \\ |     | /     /| /  \\/   /_/  |  /           /| \n" +
                        "                   | \\_____\\ \\_____\\/_____/ |\\______| /_____/ |/_____/|| \\_____\\ \\_____\\ /_____/ /______/||\\     \\_____/ ||____________/| /___________/ | \n" +
                        "                   | |     | |     ||     | | |     ||     | / |    | || |     | |     ||      | |     | || \\_____\\   | / |           | /|           | /  \n" +
                        "                    \\|_____|\\|_____||_____|/ \\|_____||_____|/  |____|/  \\|_____|\\|_____||______|/|_____|/  \\ |    |___|/  |___________|/ |___________|/   \n" +
                        "                                                                                                            \\|____|                                      ";


    }

    /**
     * Setzt verschiedene Strings zu einem String zusammen
     *
     * @return Zusammengesetzter String
     */
    @Override
    public String toString() {
        return textArkanoid + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + textEnter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bildschirmStarten() {
        startbildschirmAnzeigen = true;
        long letzteAnzeige = 0;
        int parameterFarbenWechsler = 1;
        do {
            long aktuelleSystemZeit = System.currentTimeMillis();
            this.tastenAuswerten();

            if (aktuelleSystemZeit - letzteAnzeige >= 400) {
                gameView.addToCanvas(stern.getStern(), stern.getPositionY(), stern.getPositionX(), Color.YELLOW);
                try {
                    sterneAnlegen();
                } catch (CloneNotSupportedException ce) {
                }


                gameView.addToCanvas(raumschiff.getRaumschiff(), raumschiff.getPositionY(), raumschiff.getPositionX(), Color.blue);

                raumschiff.bewegen();
                if (parameterFarbenWechsler == 1) {
                    parameterFarbenWechsler = 2;
                    gameView.addToCanvas(this.toString(), 8, 1, Color.green);

                } else if (parameterFarbenWechsler == 2) {
                    gameView.addToCanvas(this.toString(), 8, 1, Color.red);
                    parameterFarbenWechsler = 1;
                }
                letzteAnzeige = aktuelleSystemZeit;

                gameView.printCanvas();
                gameView.clearCanvas();
            }
        }
        while (startbildschirmAnzeigen);
    }

    /**
     * Es wird ueberprueft ob die Enter Taste gedrueckt wurde.
     */
    public void tastenAuswerten() {
        {
            Integer[] gedruekteTasten = gameView.getKeyCodesOfCurrentlyPressedKeys();
            if (gedruekteTasten.length > 0) {
                for (int keyCode : gedruekteTasten) {
                    if (keyCode == KeyEvent.VK_ENTER) {
                        startbildschirmAnzeigen = false;
                    }
                }
            }
        }
    }


    private void sterneAnlegen() throws CloneNotSupportedException {
        Stern stern2 = (Stern) stern.clone();
        stern2.setPositionX(70);
        Stern stern3 = (Stern) stern.clone();
        stern3.setPositionX(90);
        gameView.addToCanvas(stern2.getStern(), stern2.getPositionY(), stern2.getPositionX(), Color.YELLOW);
        gameView.addToCanvas(stern3.getStern(), stern3.getPositionY(), stern3.getPositionX(), Color.YELLOW);
    }

}
