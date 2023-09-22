package org.example;

public class Main {
    public static void main(String[] args) {
        int value = 19;

        primeCheck(value);

    }

    private static void primeCheck(int value) {
        boolean isPrime = true;
        if (value <1) {
            System.out.println("Invalid number");
            return;
        }
        if (value == 1) {
            System.out.println("Prime");
            return;
        }

        for (int i = 2; i < value; i++) {

            if (value % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.println("Prime");

        } else {
            System.out.println("no Prime");
        }
    }
}