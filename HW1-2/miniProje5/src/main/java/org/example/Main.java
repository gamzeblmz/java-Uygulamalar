package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9 };
        int searched = 10;
        findNumber(numbers,searched);
    }
    public static void findNumber(int[] numbers,int searched ){

        boolean varMi = false;
        for (int number : numbers) {

            if (number == searched) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("there is a searched number!");

        } else {
            System.out.println("there is NOT searched number!!");
        }
    }
}