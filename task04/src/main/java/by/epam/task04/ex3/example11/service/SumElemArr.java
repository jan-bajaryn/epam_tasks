package by.epam.task04.ex3.example11.service;

import by.epam.task04.ex3.example11.service.exception.IllegalCountException;
import by.epam.task04.ex3.example11.service.exception.NullArrayException;

public class SumElemArr {
    public int sum(int[] arr, int begin, int count) throws NullArrayException, IllegalCountException {
        if (arr == null) {
            throw new NullArrayException();
        }
        int lastIndex = begin + count - 1;
        if (begin<0 || begin > arr.length || arr.length - 1 < lastIndex) {
            throw new IllegalCountException();
        }

        int result = 0;
        for (int i = begin; i <= lastIndex; i++) {
            result += arr[i];
        }
        return result;
    }
}
