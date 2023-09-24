package org.example;

public class BaseKrediManager {
    //final keywordü ile yazilirsa method ezilemez override edilemez yani!!!!!
    public double hesapla(double tutar){
        return tutar * 1.18;
    }
}
