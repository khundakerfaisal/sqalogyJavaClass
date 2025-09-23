package Class2;

import java.util.Scanner;

public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int input = sc.nextInt();
            System.out.println("You entered an Integer: " + input);
        } catch (Exception e) {
            System.out.println("Invalid number format!");
        }
    }
}
