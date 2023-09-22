package org.example;

public class Main {
    public static void main(String[] args) {
        String[] tech = {"telefon","tablet","bilgisayar"};

        for (int i = 0; i < tech.length; i++) {
            System.out.println(tech[i]);
        }

        for (String animal:tech) {
            System.out.println(animal);
        }
    }
}