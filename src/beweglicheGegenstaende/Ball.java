package beweglicheGegenstaende;

import grafischeGegenstaende.RechteckigeGegenstaende;
import unbeweglicheGegenstaende.Block;

public class Ball extends RechteckigeGegenstaende {

    private int richtungX;
    private int richtungY;
    private boolean klebenAmSchlaeger;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Ball.
     * Der Konstruktor der Oberklasse RechteckigeGegenstaende wird aufgerufen.
     *
     * @param positionY     Aktuelle Position des Balles auf der Y-Achse
     * @param positionX     Aktuelle Position des Balles auf der X-Achse
     * @param hoehe         Aktuelle Hoehe des Balles
     * @param breite        Aktuelle Breite des Balles
     * @param zeichenAufbau Zeichen aus denen sich der Ball später zusammensetzt
     */
    public Ball(int positionY, int positionX, int hoehe, int breite, String zeichenAufbau) {
        super(positionY, positionX, hoehe, breite, zeichenAufbau);
        richtungX = -1;
        richtungY = -2;
        klebenAmSchlaeger = true;
    }

    /**
     * Es wird ueberprueft ob der Ball am Schlaeger kleben bleibt und sich mitbewegt.
     * Wenn nicht, wird er in die jeweilige X und Y Richtung bewegt
     *
     * @param positionYSchlaeger Aktuelle Position des Schlaegers auf der Y-Achse
     * @param positionXSchlaeger Aktuelle Position des Schlaegers auf der X-Achse
     * @param breiteSchlaeger    Breite des Schlaegers
     */
    public void bewegen(int positionYSchlaeger, int positionXSchlaeger, int breiteSchlaeger) {
        if (klebenAmSchlaeger == true) {
            positionX = positionXSchlaeger + breiteSchlaeger / 2;
            positionY = positionYSchlaeger - 5;
        } else {
            positionX += richtungX;
            positionY += richtungY;
        }
    }

    /**
     * Beendet das Kleben des Balles am Schlaeger.
     */
    public void setKlebenAmSchlaegerFalse() {
        klebenAmSchlaeger = false;
    }

    /**
     * Laesst den Ball am Schlaeger kleben.
     */
    public void setKlebenAmSchlaegerTrue() {
        klebenAmSchlaeger = true;
    }

    /**
     * Die Hitbox des jeweiligen Blockes wird abgefragt und mit der Position des Balles verglichen.
     * Die Flugrichtung wird abhängig von der Seite der Kollision umgedreht.
     *
     * @param block Der Block, welcher auf Kollision mit dem Ball geprüft wird.
     * @return TRUE, wenn der Ball mit dem Block kollidiert und FALSE wenn nicht.
     */
    public boolean kollisionMitBlockVerarbeiten(Block block) {
      if (positionY < block.getPositionY() + block.getHoehe() && positionY + hoehe > block.getPositionY() + 2 && (positionX + breite == block.getPositionX() || positionX + breite == block.getPositionX() + 1)) {

        positionX -= 2;

        richtungX = -richtungX;

        return true;
    } else if (positionY < block.getPositionY() + block.getHoehe() && positionY + hoehe > block.getPositionY() + 2 && (positionX == block.getPositionX() + block.getBreite() || positionX == block.getPositionX() + block.getBreite() + 1)) {

        positionX += 2;

        richtungX = -richtungX;
        return true;
    }

        else if ((positionY == block.getPositionY() + block.getHoehe() || positionY == block.getPositionY() + block.getHoehe() + 1) && block.getPositionX() + block.getBreite() >= positionX && block.getPositionX() <= positionX + breite) {

            positionY += 2;

            richtungY = -richtungY;
            return true;
        } else if ((positionY + hoehe == block.getPositionY() || positionY + hoehe == block.getPositionY() + 1) && block.getPositionX() + block.getBreite() >= positionX && block.getPositionX() <= positionX + breite) {

            positionY -= 2;

            richtungY = -richtungY;
            return true;}
         else return false;
    }

    /**
     * Ueberprueft die X-Position des Balles und negiert die Flugrichtung, falls sich der Ball am Rand befindet
     *
     * @return TRUE, wenn der Ball mit dem Rand kollidiert und FALSE wenn nicht.
     */
    public boolean kollisionMitRandVerarbeiten() {
        if (positionX <= 20 && richtungX < 0) {
            richtungX = -richtungX;
            return true;
        }

        if (positionY <= 20 && richtungY < 0) {
            richtungY = -richtungY;
            return true;
        }
        if (positionX > 419 - this.getBreite() && richtungX > 0) {
            richtungX = -richtungX;
            return true;
        } else return false;
    }

    /**
     * Vergleicht die Hitbox des Schlaegers mit der Hitbox des Balles.
     * Wenn diese uebereinstimmen wird die Flugrichtung des Balles abhaengig vom Aufschlagpunkt am Schlaeger veraendert.
     *
     * @param positionYSchlaeger Aktuelle Position des Schlaegers auf der Y-Achse
     * @param positionXSchlaeger Aktuelle Position des Schlaegers auf der X-Achse
     * @param hoeheSchlaeger     Hoehe des Schlaegers
     * @param breiteSchlaeger    Breite des Schlaegers
     * @return TRUE, wenn der Ball mit dem Schlaeger kollidiert und FALSE wenn nicht
     */
    public boolean kollisionMitSchlaegerVerarbeiten(int positionYSchlaeger, int positionXSchlaeger, int hoeheSchlaeger, int breiteSchlaeger) {

        if (positionY <= positionYSchlaeger + hoeheSchlaeger && positionY + hoehe >= positionYSchlaeger && positionXSchlaeger + breiteSchlaeger >= positionX && positionXSchlaeger <= positionX) {

            if (positionX + breite + 1 >= positionXSchlaeger && positionX <= positionXSchlaeger + breiteSchlaeger + 1) {
                if (positionX <= positionXSchlaeger + breiteSchlaeger * 0.2) {
                    richtungX = -2;

                } else if (positionX <= positionXSchlaeger + breiteSchlaeger * 0.45) {
                    richtungX = -1;
                } else if (positionX <= positionXSchlaeger + breiteSchlaeger * 0.55) {
                    richtungX = 0;
                } else if (positionX <= positionXSchlaeger + breiteSchlaeger * 0.8) {
                    richtungX = 1;
                } else if (positionX <= positionXSchlaeger + breiteSchlaeger * 1) {
                    richtungX = 2;
                }
            }

            if (richtungY > 0) {
                richtungY = -richtungY;
            }
            return true;
        } else return false;
    }
}
