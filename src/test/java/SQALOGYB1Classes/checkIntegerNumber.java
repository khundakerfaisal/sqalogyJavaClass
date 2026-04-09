package SQALOGYB1Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class checkIntegerNumber {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter max number :");
            int max=sc.nextInt();
            System.out.println("Enter min number :");
            int min=sc.nextInt();
            System.out.println("The Int number is " + max + " " + min);
        }catch (InputMismatchException e){
            System.out.println("Invalid type");
        }
    }

}
