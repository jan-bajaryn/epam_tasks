package by.epam.task04.ex4.example16.service.exceptiion;

public class IllegalInputMinMaxException extends Exception {
    public IllegalInputMinMaxException() {
        super();
    }

    public IllegalInputMinMaxException(String message) {
        super(message);
    }

    public IllegalInputMinMaxException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalInputMinMaxException(Throwable cause) {
        super(cause);
    }

    protected IllegalInputMinMaxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
