package org.example;

public class Main {
    public static void main(String[] args) {
       CustomerManager customerManager= new CustomerManager();
       // bu şekilde bir kullanımda BaseDataManager abstarct olduğu için bunu direkt çalıştıramıyor örnek yok bizim için burada
        //heap var ama newlenmiş bir şey yok stack yok
       //customerManager.getCustomer();

        //CONFİGURASYONLAR
        customerManager.baseDatabaseManager= new OracleDatabaseManager();
        customerManager.getCustomer();
        customerManager.baseDatabaseManager= new SqlServerDatabaseManager();
        customerManager.getCustomer();
    }
}