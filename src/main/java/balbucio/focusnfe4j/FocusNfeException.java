package balbucio.focusnfe4j;

/**
 * Base exception for focusnfe4j.
 */
public class FocusNfeException extends RuntimeException {
    public FocusNfeException(String message) {
        super(message);
    }

    public FocusNfeException(String message, Throwable cause) {
        super(message, cause);
    }
}

