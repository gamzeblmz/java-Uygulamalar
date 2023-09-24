package org.example;

//bir classın abstarct olması için abstract keywordüyle yazılmalı
//bstarct sınıflar asla new lenmezz!!!!!
public abstract class GameCalculator {

    //bu classı inherit eden classlar hesaplayı override etmek zorunda
    public abstract void hesapla();
    public void gameOver(){
        System.out.println("oyun bitti!");
    }
}
