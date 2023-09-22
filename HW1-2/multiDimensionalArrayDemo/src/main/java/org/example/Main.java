package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] county = new String[2][3];

        county[0][0] = "Sultangazi";
        county[1][0] = "GOP";
        county[0][2] = "Avcilar";
        county[0][1] = "Bayrampasa";
        county[1][1] = "Ikitelli";
        county[1][2] = "Halkalı";

        for (int i = 0; i < 2; i++) {
            System.out.println("-------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(county[i][j]);
            }
        }
    }
}