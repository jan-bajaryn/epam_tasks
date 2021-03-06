package by.epam.task07.twodemesionalarrays.factory;

import by.epam.task07.twodemesionalarrays.entity.Matrix;
import by.epam.task07.twodemesionalarrays.factory.exception.IllegalArgsMatrixException;
import by.epam.task07.twodemesionalarrays.validator.MatrixValidator;

public class MatrixFactory {
    MatrixValidator matrixValidator = new MatrixValidator();

    public Matrix create(int rows, int columns) throws IllegalArgsMatrixException {
        if (!matrixValidator.validateMatrixArgs(rows, columns)) {
            throw new IllegalArgsMatrixException();
        }

        return new Matrix(rows, columns);

    }
}
