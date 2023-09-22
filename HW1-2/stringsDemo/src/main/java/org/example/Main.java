package org.example;

public class Main {
    public static void main(String[] args) {
        String message = "Today is a good day!";
        System.out.println(message);
        System.out.println("Eleman sayısı : " + message.length());
        System.out.println("6. eleman : " + message.charAt(6));
        message.concat("yeaaaah!!");
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("!"));
        char[] chars = new char[3];
        message.getChars(0,3,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf("is"));
        System.out.println(message.lastIndexOf("d"));

        System.out.println(message.replace("a", "-"));

        System.out.println(message.substring(4));
        System.out.println(message.substring(0, 8));
        System.out.println(message.substring(4, 8));

        for (String word : message.split("  ")) {
            System.out.println(word);
            System.out.println(message.toLowerCase());
            System.out.println(message.toUpperCase());

            String message1 = "    Today is a good day!   ";
            System.out.println(message1);
            System.out.println(message1.trim());
        }
    }
}