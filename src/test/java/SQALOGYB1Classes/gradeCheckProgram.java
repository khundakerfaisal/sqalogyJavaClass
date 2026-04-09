package SQALOGYB1Classes;

import java.util.Scanner;

public class gradeCheckProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number : ");
        int number = sc.nextInt();
        if (number >= 80 && number <= 100) {
            System.out.println("Grade is A+");
        } else if (number >= 70 && number <= 79) {
            System.out.println("Grade is A");
        } else if (number >= 60 && number <= 69) {
            System.out.println("Grade is A-");
        } else if (number >= 40 && number <= 59) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }
    }
}
