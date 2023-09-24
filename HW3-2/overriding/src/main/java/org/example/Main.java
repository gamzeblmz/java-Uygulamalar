package org.example;


public class Main {
    public static void main(String[] args) {
          BaseKrediManager[] baseKrediManager=new BaseKrediManager[]{
                  new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
          for (BaseKrediManager baseKrediManager1:baseKrediManager){
              System.out.println(baseKrediManager1.hesapla(1000));
          }
    }
}