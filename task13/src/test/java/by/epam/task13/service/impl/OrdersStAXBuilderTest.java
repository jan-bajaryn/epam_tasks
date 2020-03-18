package by.epam.task13.service.impl;

import by.epam.task13.entities.DeliveryInf;
import by.epam.task13.entities.Order;
import by.epam.task13.entities.Product;
import by.epam.task13.entities.enums.OrderStatus;
import by.epam.task13.entities.enums.PaymentType;
import by.epam.task13.entities.enums.ProductSize;
import by.epam.task13.entities.enums.ProductType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class OrdersStAXBuilderTest {

    private static final Logger log = LogManager.getLogger(OrdersStAXBuilderTest.class);


    @Test
    public void testBuildListOrders() {
        OrdersStAXBuilder ordersStAxBuilder = new OrdersStAXBuilder();
        ordersStAxBuilder.buildListOrders("src/main/resources/orders.xml");
        System.out.println(ordersStAxBuilder.getOrders());
    }


    @Test
    public void testOrders() {
        List<Order> list = createOrders();

        OrdersStAXBuilder ordersStAxBuilder = new OrdersStAXBuilder();

        ordersStAxBuilder.buildListOrders("D:\\Programming\\epam\\epam\\task13\\src\\main\\resources\\totest\\orders.xml");
        assertEquals(ordersStAxBuilder.getOrders(), list);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testNull() throws NullPointerException {
        OrdersStAXBuilder ordersStAxBuilder = new OrdersStAXBuilder();
        ordersStAxBuilder.buildListOrders(null);
    }

    @Test
    public void negative() {

        OrdersStAXBuilder ordersStAxBuilder = new OrdersStAXBuilder();

        ordersStAxBuilder.buildListOrders("D:\\Programming\\epam\\epam\\task13\\src\\main\\resources\\temp.xml");
        assertEquals(new ArrayList<>(), ordersStAxBuilder.getOrders());
    }

    private List<Order> createOrders() {
        Order order1 = Order.builder()
                .id(1)
                .creation(LocalDateTime.parse("2020-02-24T09:30:10.5"))
                .price(1200)
                .status(OrderStatus.WAITING)
                .paymentType(PaymentType.BANK_CARD)

                .products(new ArrayList<Product>(
                        Arrays.asList(
                                Product.builder()
                                        .id(1L)
                                        .name("Margarita")
                                        .description("Very good classic pizza")
                                        .photoName("Margarita.jpg")
                                        .price(900)
                                        .type(ProductType.PIZZA)
                                        .size(ProductSize.valueOf("md".toUpperCase()))
                                        .ingredients(new ArrayList<>(Arrays.asList(
                                                "Cheese",
                                                "Tomato",
                                                "Bacon"
                                        ))).build()
                                ,
                                Product.builder()
                                        .id(2L)
                                        .name("Coca-cola")
                                        .type(ProductType.DRINK)
                                        .description("Classical american drink")
                                        .photoName("Coca-cola.jpg")
                                        .price(300)
                                        .size(ProductSize.valueOf("sm".toUpperCase()))
                                        .ingredients(new ArrayList<>())
                                        .build()
                        )
                ))
                .build();

        Order order2 = Order.builder()
                .id(2)
                .creation(LocalDateTime.parse("2020-02-25T09:30:10.5"))
                .price(1800)
                .status(OrderStatus.WAITING)
                .paymentType(PaymentType.BANK_CARD)
                .deliveryInf(
                        DeliveryInf.builder()
                                .clientName("Jan")
                                .deliveryTime(LocalDateTime.parse("2002-05-30T09:30:10.5"))
                                .address("Lenina 30, 30")
                                .phone("+375 29 345 34 34")
                                .email("abcd@gmail.com")
                                .build()
                )
                .products(new ArrayList<Product>(
                        Collections.singletonList(
                                Product.builder()
                                        .id(3L)
                                        .name("Bacon-and-cheese")
                                        .description("Pizza with bacon and cheese")
                                        .photoName("Bacon-and-cheese.jpg")
                                        .price(1800)
                                        .type(ProductType.PIZZA)
                                        .size(ProductSize.valueOf("lg".toUpperCase()))
                                        .ingredients(new ArrayList<>(Arrays.asList(
                                                "Cheese",
                                                "Mushroom",
                                                "Bacon"
                                        ))).build()
                        )
                ))
                .build();

        return new ArrayList<>(Arrays.asList(order1, order2));
    }

}