package exceptions;

public class LevelException extends Exception {
    /**
     * Initialisiert eine LevelException
     */
    public LevelException()
    {
        super();
    }

    /**
     * Initialisiert eine LevelException
     * @param nachricht Nachricht die im Fehlerfall ausgegeben werden soll
     */
    public LevelException(String nachricht)
    {
        super(nachricht);
    }
}
