package org.example.business;

import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

public class ProductManager {
    JdbcProductDao jdbcProductDao= new JdbcProductDao();
    public void add(Product product) throws Exception {
        // is kurallari yazilir
        if(product.getUnitPrice()<10){
           throw new Exception("urun fiyati 10'dan kucuk olamaz.");
        }
        jdbcProductDao.add(product);
    }
}
