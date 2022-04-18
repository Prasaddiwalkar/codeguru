package my.phonepe.cab.management.exceptions;

public class RecordAlreadyPresentException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -792519329591459057L;

    public RecordAlreadyPresentException(String message) {
        super(message);
    }
}
