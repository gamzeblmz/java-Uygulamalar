package org.example;

public class ProductValidator {
    //const newleyince calisir
    public ProductValidator() {
        System.out.println("yapici blok calisti");
    }
    static {
        System.out.println("satic method calisti.");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else
            return false;
    }

    //method static olmadıgı için çağırırken newlemek gerekir
    public void birsey() {

    }
    //ana class static olmaz ama bu sekilde kullanılır buna inner class denir
    public static class BaskaBirClass{

    }
}
