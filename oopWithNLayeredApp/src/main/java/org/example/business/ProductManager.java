package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

public class ProductManager {
   private ProductDao productDao;
   private List<Logger>loggers;
    public ProductManager(ProductDao productDao,List<Logger>loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        // is kurallari yazilir
        if(product.getUnitPrice()<10){
           throw new Exception("urun fiyati 10'dan kucuk olamaz.");
        }
        productDao.add(product);

        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
