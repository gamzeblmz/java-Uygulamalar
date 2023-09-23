package org.example;
public class Main {
    public static void main(String[] args) {
       findNumber();
    }
    public static void findNumber(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int searchedNum =6;
        boolean isThere=false;
        for (int number: numbers){
            if (number==searchedNum){
                isThere=true;
                break;
            }
        }
        String message="";
        if (isThere){
            message = "the number is available: " + searchedNum;
            giveMessage("the number is available: " + searchedNum);

        }else {
            System.out.println("the number is not available: " + searchedNum);
        }

    }
    public static void giveMessage(String message){
        System.out.println(message);
    }
}