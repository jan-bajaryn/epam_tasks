package by.epam.learn.task2.branching.example2.creator;

import by.epam.learn.task2.branching.example2.domain.Triangle;
import by.epam.learn.task2.branching.example2.exception.WrongSidesTriangleException;
import by.epam.learn.task2.branching.example2.validator.TriangleValidator;

public class TriangleCreator {
    TriangleValidator triangleValidator;

    public TriangleCreator() {
        triangleValidator = new TriangleValidator();
    }

    public Triangle create(double f, double s, double t) throws WrongSidesTriangleException {
        Triangle triangle = new Triangle(f,s,t);
        if (triangleValidator.isValid(triangle)){
            return triangle;
        }else {
            throw new WrongSidesTriangleException();
        }
    }
}
