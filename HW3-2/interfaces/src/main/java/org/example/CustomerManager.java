package org.example;

public class CustomerManager {
    //is kodları
    ICustomerDal iCustomerDal;
    public CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal=iCustomerDal;
    }
    public void add(){
        iCustomerDal.add();
    }

}
