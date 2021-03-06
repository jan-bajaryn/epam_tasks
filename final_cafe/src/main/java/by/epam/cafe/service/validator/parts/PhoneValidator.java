package by.epam.cafe.service.validator.parts;

import by.epam.cafe.service.Validator;

import java.util.regex.Pattern;

public class PhoneValidator implements Validator<String> {

    public static final String PHONE_REGEX = "\\d{9}";
    private static final Pattern COMPILE = Pattern.compile(PHONE_REGEX, Pattern.UNICODE_CASE);

    @Override
    public boolean isValid(String input) {
        return COMPILE.matcher(input).matches();
    }
}
