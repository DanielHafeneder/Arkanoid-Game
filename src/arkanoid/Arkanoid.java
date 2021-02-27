package arkanoid;


import bildschirme.Endbildschirm;
import exceptions.LevelException;
import gameView.GameView;
import level.Level;
import level.Level1;
import level.Level2;
import unbeweglicheGegenstaende.Score;
import bildschirme.Startbildschirm;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Arkanoid {
    private GameView gameView;
    /**
     * Anzahl der Zeilen des Spiels
     */
    public static final int ZEILEN = 360;
    /**
     * Anzahl der Spalten des Spiels
     */
    public static final int SPALTEN = 550;
    private Level level;
    private Score score;
    private Score highscore;
    private int leben;
    private Startbildschirm startbildschirm;
    private Endbildschirm endBildschirm;


    private Arkanoid() {
        gameView = new GameView(ZEILEN, SPALTEN, GameView.WINDOWSIZE_LARGE);
        gameView.setTitle("Arkanoid");
        score = new Score(0);
        highscore = new Score(0);
        leben = 3;
        colorMapSetzen();
    }

    /**
     * Das Spiel wird gestartet und durchgefuehrt
     *
     * @param args speichert Kommandozeilen
     */
    public static void main(String[] args) {
        new Arkanoid().spielAblaufStarten();
    }

    private void spielAblaufStarten() {
        do {
            startbildschirm = new Startbildschirm(gameView);
            startbildschirm.bildschirmStarten();

            try {
                levelAnlegen();
            } catch (LevelException e) {
                e.printStackTrace();
            }
            endBildschirm = new Endbildschirm(gameView, score, highscore);
            endBildschirm.bildschirmStarten();
            aufNeuenHighscoreUeberpruefen();
        }
        while (true);


    }

    private void colorMapSetzen() {
        HashMap<Character, Color> colorMap = new HashMap<>(Map.of());
        colorMap.put('=', new Color(9, 14, 145));
        colorMap.put('*', new Color(175, 0, 5));
        colorMap.put('-', new Color(255, 250, 39));
        colorMap.put('/', new Color(38, 208, 64));
        colorMap.put('X', new Color(255, 36, 243));
        colorMap.put('Y', new Color(255, 143, 32));
        colorMap.put('%', new Color(255, 255, 255));
        colorMap.put('$', new Color(186, 186, 186));
        colorMap.put('L', new Color(118, 60, 19));
        colorMap.put('_', new Color(42, 18, 205));
        colorMap.put('|', new Color(131, 133, 127));
        colorMap.put('▓', new Color(105, 47, 25));
        colorMap.put('▄', new Color(255, 3, 1));
        colorMap.put('░', new Color(255, 255, 255));
        colorMap.put('▌', new Color(255, 3, 1));
        colorMap.put('▐', new Color(255, 3, 1));
        colorMap.put('▀', new Color(255, 3, 1));
        colorMap.put('V', new Color(40, 64, 255));

        gameView.setColormap(colorMap);
    }

    private void aufNeuenHighscoreUeberpruefen() {
        if (score.compareTo(highscore) > 0) {
            highscore.setScoreZaehler(score.getScoreZaehler());
        }
        score.setScoreZaehler(0);
    }


    private void levelAnlegen() throws LevelException {
        if (leben > 0) {
            level = new Level1(gameView, ZEILEN, SPALTEN, score, highscore, leben);
            level.aufbauLevel();
            level.levelSpielen();
            if (level.getAmLeben()) {
                level = new Level2(gameView, ZEILEN, SPALTEN, score, highscore, leben);
                level.aufbauLevel();
                level.levelSpielen();
            }
        } else {
            throw new LevelException("Leben muss beim Anlegen eines Levels groesser als 0 sein!");
        }
    }


}
