package Class1;

import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter max number");
            int max = input.nextInt();
            System.out.println("Enter min number");
            int min = input.nextInt();
            System.out.println("The Int number is " + max + " " + min);

        } catch (Exception e) {
            System.out.println("You entered double number");
        }finally {
            System.out.println("Please try without decimal value");
        }

    }
}
