package Class1;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input age: ");
        int value = sc.nextInt();

        boolean age = value <= 16;  // Check if age is 16 or less

        if (age) {
            System.out.println("You have input the wrong age");
        } else {
            System.out.println("You have input the correct age");
        }

        sc.close();


    }

}
