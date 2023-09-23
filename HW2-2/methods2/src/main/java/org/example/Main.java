package org.example;

public class Main {
    public static void main(String[] args) {
        String message = "Today is a good day.";
        String newMessage = citys();
        System.out.println(newMessage);
        int number = add(15, 7);
        System.out.println(number);
        int total = add2(2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7);
        System.out.println(total);
    }

    public static void ekle() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("updated");
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    private static String citys() {
        return "London";
    }

}