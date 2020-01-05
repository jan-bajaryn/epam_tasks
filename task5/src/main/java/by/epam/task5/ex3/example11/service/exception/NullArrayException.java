package by.epam.task5.ex3.example11.service.exception;

public class NullArrayException extends Exception {
    public NullArrayException() {
        super();
    }

    public NullArrayException(String message) {
        super(message);
    }

    public NullArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullArrayException(Throwable cause) {
        super(cause);
    }

}
