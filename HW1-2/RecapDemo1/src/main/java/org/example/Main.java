package org.example;

public class Main {
    public static void main(String[] args) {
        int value1 = 15;
        int value2 = 33;
        int value3 = 23;
        int biggestValue = value1;

        if (biggestValue<value2) {
            biggestValue=value2;
        }
        if (biggestValue<value3) {
            biggestValue=value3;
        }
        System.out.println("Biggest value is " + biggestValue);
    }
}