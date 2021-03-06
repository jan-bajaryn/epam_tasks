package by.epam.cafe.dao;

import by.epam.cafe.dao.exception.DaoException;
import by.epam.cafe.dao.mysql.Transaction;
import by.epam.cafe.dao.mysql.impl.*;

import java.sql.SQLException;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final DeliveryInfMysqlDao deliveryInfMysqlDao = new DeliveryInfMysqlDao();
    private final OrderMysqlDao orderMysqlDao = new OrderMysqlDao();
    private final ProductMysqlDao productMysqlDao = new ProductMysqlDao();
    private final ProductGroupMysqlDao productGroupMysqlDao = new ProductGroupMysqlDao();
    private final UserMysqlDao userMysqlDao = new UserMysqlDao();

    private final ImageWriterDao imageWriterDao = new ImageWriterDao();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public DeliveryInfMysqlDao getDeliveryInfMysqlDao() {
        return deliveryInfMysqlDao;
    }

    public OrderMysqlDao getOrderMysqlDao() {
        return orderMysqlDao;
    }

    public ProductMysqlDao getProductMysqlDao() {
        return productMysqlDao;
    }

    public ProductGroupMysqlDao getProductGroupMysqlDao() {
        return productGroupMysqlDao;
    }

    public UserMysqlDao getUserMysqlDao() {
        return userMysqlDao;
    }

    public ImageWriterDao getImageWriterDao() {
        return imageWriterDao;
    }

    public Transaction createTransaction() throws DaoException {
        Transaction transaction = new Transaction();
        transaction.beginTransaction();
        return transaction;
    }
}
