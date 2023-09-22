package org.example;

public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Well done : You passed");
                break;
            case 'B':
                System.out.println("Good job : You passed");
                break;
            case 'C':
                System.out.println("Not bad : You passed");
                break;
            case 'F':
                System.out.println("Unfortunately : You couldn't pass");
                break;
            default:
                System.out.println("Invalid grade");

        }
    }
}