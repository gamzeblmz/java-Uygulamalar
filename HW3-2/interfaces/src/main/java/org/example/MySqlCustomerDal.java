package org.example;

//bir class birden fazla interface implement edebilir
public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("MySql eklendi.");
    }
}
