package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        // sadece db erisim kodları yazilir
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
