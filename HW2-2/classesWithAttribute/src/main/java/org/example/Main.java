package org.example;

public class Main {
    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
//         product.name="Laptop";
//         product.id=1;
//         product.description="Asus Laptop";
//         product.price=5000;
//         product.stockAmount=3;

         ProductManager productManager= new ProductManager();
         productManager.Add(product);
        System.out.println(product.getDescription());
    }
}