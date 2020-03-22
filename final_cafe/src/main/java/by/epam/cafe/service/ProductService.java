package by.epam.cafe.service;

import by.epam.cafe.entity.impl.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findEntityById(Integer integer);

    boolean deleteById(Integer integer);

    boolean delete(Product entity);

    boolean create(Product entity);

    boolean update(Product entity);
}
