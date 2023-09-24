package org.example;

//interfacelerde newlenemez.
//interface onu implemente eden classın referansını tutar.
public class Main {
    public static void main(String[] args) {
        ICustomerDal iCustomerDal= new OracleCustomerDal();
        iCustomerDal.add();
    }
}