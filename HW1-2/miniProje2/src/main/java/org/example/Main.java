package org.example;

public class Main {
    public static void main(String[] args) {
        char harf = 'a';
        wordCheck(harf);
    }

    public static void wordCheck(char harf) {
        switch (Character.toUpperCase(harf)) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harfler");

                switch (harf) {
                    case 'E':
                    case 'Ü':
                    case 'Ö':
                    case 'İ':
                        System.out.println("Ince sesli harfler");
                }
                break;
            default:
                System.out.println("Bu bir sesli harf degildir!");

        }
    }
}
