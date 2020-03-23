package by.epam.cafe.service.factory;

import by.epam.cafe.service.*;
import by.epam.cafe.service.impl.*;
import by.epam.cafe.service.parser.PathVarCalculator;
import by.epam.cafe.service.parser.impl.PathVarCalculatorImpl;

public class ServiceFactory {
    private static ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ServiceFactory() {
    }

    private final DeliveryInfService deliveryInfService = new DeliveryInfServiceImpl();
    private final OrderService orderService = new OrderServiceImpl();
    private final ProductGroupService productGroupService = new ProductGroupServiceImpl();
    private final ProductService productServiceImpl = new ProductServiceImpl();
    private final UserService userService = new UserServiceImpl();
    private final PathVarCalculator pathVarCalculator = new PathVarCalculatorImpl();

    public DeliveryInfService getDeliveryInfService() {
        return deliveryInfService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public ProductGroupService getProductGroupService() {
        return productGroupService;
    }

    public ProductService getProductService() {
        return productServiceImpl;
    }

    public UserService getUserService() {
        return userService;
    }

    public PathVarCalculator getPathVarCalculator() {
        return pathVarCalculator;
    }
}
