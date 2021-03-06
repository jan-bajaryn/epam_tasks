package by.epam.cafe.service.parser.parts;

import by.epam.cafe.entity.enums.ProductType;
import by.epam.cafe.service.validator.parts.ProductTypeValidator;

public class ProductTypeParser extends ParamsParser<ProductType>{

    private static final ProductTypeValidator VALIDATOR = new ProductTypeValidator();

    public ProductTypeParser() {
        super(VALIDATOR);
    }

    @Override
    protected ProductType modify(String input) throws Exception {
        return ProductType.valueOf(input);
    }
}
