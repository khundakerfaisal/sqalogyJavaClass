package SqalogyClasses;

import java.util.Random;
import java.util.Scanner;

public class PracticeClass2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matchNumber = String.valueOf(Math.round(Math.random() * 100));
        System.out.println(matchNumber);
        String userInput = "";
        while (!userInput.equals(matchNumber)) {
            System.out.println("Please enter number");
            userInput=sc.nextLine();
            if (userInput.equals(matchNumber)){
                System.out.println("YAHOO!! You choose the correct number");

            }
        else{
                System.out.println("You choose wrong Number ! Please entre again ..");
            }
        }
    }
}
