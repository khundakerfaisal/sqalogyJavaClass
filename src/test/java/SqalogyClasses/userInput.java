package SqalogyClasses;

import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First Name");
        String firstName = input.nextLine();
        System.out.println("Please enter Last Name");
        String lastName = input.nextLine();
        System.out.println("Full name is " + firstName + " " + lastName);


    }
}
