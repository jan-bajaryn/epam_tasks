package by.epam.cafe.service.parser.parts;

import by.epam.cafe.service.validator.parts.SurnameValidator;

public class SurnameParser extends ParamsParser<String> {

    private static final SurnameValidator VALIDATOR = new SurnameValidator();

    public SurnameParser() {
        super(VALIDATOR);
    }

    @Override
    protected String modify(String input) throws Exception {
        return input.isEmpty()? null:input.strip();
    }
}
