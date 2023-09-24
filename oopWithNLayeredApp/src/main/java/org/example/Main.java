package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLoger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "Iphone xr", 10000);
        List<Logger> loggers= new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLoger());
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product);

    }
}