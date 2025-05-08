package ro.ase.acs.strategy;

public class OperationNotSetException extends RuntimeException {
    public OperationNotSetException(String message) {
        super(message);
    }

    public OperationNotSetException() {
    }

    public OperationNotSetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OperationNotSetException(Throwable cause) {
        super(cause);
    }

    public OperationNotSetException(String message, Throwable cause) {
        super(message, cause);
    }
}
