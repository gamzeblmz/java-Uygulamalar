package org.example;
public class Main {
    public static void main(String[] args) {
        //classlar ortak perasyonlari tutar
        DortIslem dortIslem=new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);
        sonuc = dortIslem.Bol(8,4);
        System.out.println(sonuc);
    }
}