package by.epam.task07.twodemesionalarrays.service.exception;

public class IllegalArgGenerationException extends Exception {
    public IllegalArgGenerationException() {
    }

    public IllegalArgGenerationException(String message) {
        super(message);
    }

    public IllegalArgGenerationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalArgGenerationException(Throwable cause) {
        super(cause);
    }

}
