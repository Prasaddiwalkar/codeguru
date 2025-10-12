package my.phonepe.cab.management.exceptions;

public class RecordAlreadyExistsException extends RuntimeException {

    /** */
    private static final long serialVersionUID = -792519329591459057L;

    public RecordAlreadyExistsException(String message) {
        super(message);
    }
}
