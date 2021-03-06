package by.epam.learn.task3.cycles.example3.ex30;

import by.epam.learn.task3.cycles.example3.ex30.parser.NumberParser;
import by.epam.learn.task3.cycles.example3.ex30.parser.exception.IllegalRomanExpressionException;

public class Runner {

    public static void main(String[] args) {
        NumberParser numberParser = new NumberParser();
        try {
            System.out.println(numberParser.toArabian("CCXLIX"));
            System.out.println(numberParser.toArabian("CCCXXXVII"));
        } catch (IllegalRomanExpressionException e) {
            System.out.println("Wrong format of an expression");
        }


    }
}
