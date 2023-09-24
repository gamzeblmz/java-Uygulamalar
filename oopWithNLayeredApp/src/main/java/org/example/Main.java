package org.example;

import org.example.business.ProductManager;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "Iphone xr", 8);
        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }
}