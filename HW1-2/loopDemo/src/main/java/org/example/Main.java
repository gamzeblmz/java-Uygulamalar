package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Loop with for is end");

        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("while loop is end");

    }
}