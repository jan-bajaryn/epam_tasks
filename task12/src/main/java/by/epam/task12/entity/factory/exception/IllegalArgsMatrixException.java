package by.epam.task12.entity.factory.exception;

public class IllegalArgsMatrixException extends Exception {
    public IllegalArgsMatrixException() {
        super();
    }

    public IllegalArgsMatrixException(String message) {
        super(message);
    }

    public IllegalArgsMatrixException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalArgsMatrixException(Throwable cause) {
        super(cause);
    }
}
