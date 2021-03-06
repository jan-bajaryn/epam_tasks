package by.epam.task09.example1.textedit.view;

import by.epam.task09.example1.textedit.entity.Text;
import by.epam.task09.example1.textedit.parser.TextParser;

public class PrintText {
    private TextParser textParser = new TextParser();

    public void print(Text text) {
        System.out.println(textParser.textParseString(text));
    }

    public void printHeader(Text text) {
        System.out.println(text.getHead());
    }
}
