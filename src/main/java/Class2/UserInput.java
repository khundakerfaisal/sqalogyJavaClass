package Class2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName=sc.nextLine();
        System.out.println("Enter Last Name:");
        String lastName=sc.nextLine();

        System.out.println(firstName+" "+lastName);

    }
}
