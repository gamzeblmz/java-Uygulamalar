package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 28;
        perfectNumber(number);

    }

    private static void perfectNumber(int number) {
        int total = 0;

        if (number < 1) {
            System.out.println("Lütfen birden büyük sayılar giriniz");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }

        }
        if (total == number) {
            System.out.println("Bu mükemmel sayıdır! ");
        }
        else {
            System.out.println("Bu mükemmel sayı değildir! ");
        }
    }
}