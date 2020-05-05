package by.epam.cafe.service.parser.parts.impl;

import by.epam.cafe.service.parser.parts.ParamsParser;
import by.epam.cafe.service.validator.Validator;
import by.epam.cafe.service.validator.parts.ProductGroupInProductValidator;

public class ProductGroupInProductParser extends ParamsParser<Integer> {

    private static final ProductGroupInProductValidator validator = new ProductGroupInProductValidator();

    public ProductGroupInProductParser() {
        super(validator);
    }

    @Override
    protected Integer modify(String input) throws Exception {
        return input == null? null:Integer.valueOf(input);
    }
}
