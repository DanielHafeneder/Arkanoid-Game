package bildschirme;

import gameView.GameView;

public class Benutzerbildschirm {
    protected String textEnter;
    protected GameView gameView;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Benutzerbildschirm.
     * Die Leinwand wird vorbereitet indem sie geleert wird, alle Sounds gestoppt und die Bildschirmauflösung angepasst wird.
     *
     * @param gameView Die Ausgabeverarbeitung des Spiels
     */
    public Benutzerbildschirm(GameView gameView) {
        this.gameView = gameView;
        textEnter =
                "                          _          _           _           _           _                 _            _           _            _            _      \n" +
                        "                           /\\ \\       /\\ \\        /\\ \\        / /\\        / /\\              /\\ \\         /\\ \\     _  /\\ \\         /\\ \\         /\\ \\    \n" +
                        "                          /  \\ \\     /  \\ \\      /  \\ \\      / /  \\      / /  \\            /  \\ \\       /  \\ \\   /\\_\\\\_\\ \\       /  \\ \\       /  \\ \\   \n" +
                        "                         / /\\ \\ \\   / /\\ \\ \\    / /\\ \\ \\    / / /\\ \\__  / / /\\ \\__        / /\\ \\ \\     / /\\ \\ \\_/ / //\\__ \\     / /\\ \\ \\     / /\\ \\ \\  \n" +
                        "                        / / /\\ \\_\\ / / /\\ \\_\\  / / /\\ \\_\\  / / /\\ \\___\\/ / /\\ \\___\\      / / /\\ \\_\\   / / /\\ \\___/ // /_ \\ \\   / / /\\ \\_\\   / / /\\ \\_\\ \n" +
                        "                       / / /_/ / // / /_/ / / / /_/_ \\/_/  \\ \\ \\ \\/___/\\ \\ \\ \\/___/     / /_/_ \\/_/  / / /  \\/____// / /\\ \\ \\ / /_/_ \\/_/  / / /_/ / / \n" +
                        "                      / / /__\\/ // / /__\\/ / / /____/\\      \\ \\ \\       \\ \\ \\          / /____/\\    / / /    / / // / /  \\/_// /____/\\    / / /__\\/ /  \n" +
                        "                     / / /_____// / /_____/ / /\\____\\/  _    \\ \\ \\  _    \\ \\ \\        / /\\____\\/   / / /    / / // / /      / /\\____\\/   / / /_____/   \n" +
                        "                    / / /      / / /\\ \\ \\  / / /______ /_/\\__/ / / /_/\\__/ / /       / / /______  / / /    / / // / /      / / /______  / / /\\ \\ \\     \n" +
                        "                   / / /      / / /  \\ \\ \\/ / /_______\\\\ \\/___/ /  \\ \\/___/ /       / / /_______\\/ / /    / / //_/ /      / / /_______\\/ / /  \\ \\ \\    \n" +
                        "                   \\/_/       \\/_/    \\_\\/\\/__________/ \\_____\\/    \\_____\\/        \\/__________/\\/_/     \\/_/ \\_\\/       \\/__________/\\/_/    \\_\\/ ";


        leinwandVorbereiten();
    }

    /**
     * Regelt die Abläufe auf dem Bildschirm und gibt ihn aus
     */
    public void bildschirmStarten() {
    }

    private void leinwandVorbereiten() {
        this.gameView.clearCanvas();
        this.gameView.changeResolution(100, 170);
        this.gameView.stopAllSounds();
    }


}
