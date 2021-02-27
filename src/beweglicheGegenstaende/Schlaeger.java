package beweglicheGegenstaende;

import gameView.GameView;
import grafischeGegenstaende.RechteckigeGegenstaende;
import interfaces.TastenAuswertbar;

import java.awt.event.KeyEvent;

public class Schlaeger extends RechteckigeGegenstaende implements TastenAuswertbar {
    private Ball ball;
    private GameView gameView;

    /**
     * @param positionY     Aktuelle Position des Schlaegers auf der Y-Achse
     * @param positionX     Aktuelle Position des Schlaegers auf der Y-Achse
     * @param hoehe         Hoehe des Schlaegers
     * @param breite        Breite des Schlaegers
     * @param zeichenAufbau Zeichen aus denen sich der Schlaeger spaeter zusammensetzt
     * @param gameView      Die Ausgabeverarbeitung des Spiels
     * @param ball          Das Objekt Ball mit seinen aktuellen Eigenschaften
     */
    public Schlaeger(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau, GameView gameView, Ball ball) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
        this.gameView = gameView;
        this.ball = ball;
    }

    private void linksBewegen() {
        positionX -= 2;
    }

    private void rechtsBewegen() {
        positionX += 2;
    }

    /**
     * Es wird ueberprueft ob bestimmte Tasten gedrueckt werden.
     * Wenn die linke Pfeiltaste gedrueckt wird, wird der Schlaeger nach links bewegt.
     * Wenn die rechte Pfeiltaste gedrueckt wird, wird der Schlaeger nach rechts bewegt.
     * Wenn die Leertaste gedrueckt wird, wird der Ball vom Schlaeger geloest.
     */
    @Override
    public void tastenAuswerten() {
        Integer[] gedruekteTasten = gameView.getKeyCodesOfCurrentlyPressedKeys();
        if (gedruekteTasten.length > 0) {
            for (int keyCode : gedruekteTasten) {
                if (keyCode == KeyEvent.VK_LEFT && this.getPositionX() > 21) {
                    this.linksBewegen();
                } else if (keyCode == KeyEvent.VK_RIGHT && this.getPositionX() < 418 - this.getBreite()) {
                    this.rechtsBewegen();
                } else if (keyCode == KeyEvent.VK_SPACE && ball.getPositionY() == 335) {
                    ball.setKlebenAmSchlaegerFalse();
                }
            }
        }
    }


}
