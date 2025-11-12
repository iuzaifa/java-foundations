package exceptions;

public class BookUnavailableException extends RuntimeException {
    public BookUnavailableException(String message, String member) {
        super(message);
    }
}
