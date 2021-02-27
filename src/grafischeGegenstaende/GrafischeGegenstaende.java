package grafischeGegenstaende;

public class GrafischeGegenstaende {
    protected int positionX;
    protected int positionY;
    protected String grafischerGegenstand;

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse
     *
     * @param positionX Aktuelle Position des Objektes auf der X-Achse
     * @param positionY Aktuelle Position des Objektes auf der Y-Achse
     */
    public GrafischeGegenstaende(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     * @return Aktuelle Position des Objektes auf der X-Achse
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * @return Aktuelle Position des Objektes auf der Y-Achse
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * @return String bzw grafische Darstellung des Objekts
     */
    public String getGrafischerGegenstand() {
        return grafischerGegenstand;
    }

    /**
     * Setzt die Position des Objektes auf der X-Achse auf den vom Nutzer uebergebenen Wert
     * @param positionX X-Achsenwert an dem das Objekt positioniert werden soll
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
}
