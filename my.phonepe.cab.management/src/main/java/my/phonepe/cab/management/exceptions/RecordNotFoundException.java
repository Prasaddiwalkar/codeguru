package my.phonepe.cab.management.exceptions;

public class RecordNotFoundException extends RuntimeException {

    /** */
    private static final long serialVersionUID = -6834300857685600254L;

    public RecordNotFoundException(String message) {
        super(message);
    }
}
