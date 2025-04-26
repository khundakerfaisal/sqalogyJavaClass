package SqalogyClasses;

import java.util.Scanner;

public class exceptionHandaling {
    public static void main(String[] args) {
        try{
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the Max Number");
            int max=input.nextInt();
            System.out.println("Enter the Min Number");
            int min=input.nextInt();
            System.out.println("The int number is :" +(int)(Math.random()*(max-min+max)));

        }catch (Exception e){
            System.out.println("You entered double number.Please type integer number");

        }finally {
            System.out.println("Please try without decimal value");

        }
    }

}
