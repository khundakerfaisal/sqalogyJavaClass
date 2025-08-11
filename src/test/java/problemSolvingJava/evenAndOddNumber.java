package problemSolvingJava;

import java.util.Scanner;

public class evenAndOddNumber {
    public int evenAndOddNumber(int number) {
        return number;
    }

    public void printSingleEvenOrOdd() {
        int numberMatch = evenAndOddNumber(6);

        if (numberMatch % 2 == 0) {
            System.out.println("Print the Even Number: " + numberMatch);
        } else {
            System.out.println("Print the Odd Number: " + numberMatch);
        }
    }

    public void printEvenAndOdd() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number is : " + i);
            } else {
                System.out.println("Odd Number Is : " + i);
            }
        }
    }
    public void printNumberFromInputClass(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input number : ");
        int number=sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even Number is : " + number);

            } else {
                System.out.println("Odd Number Is : " + number);

            }
            sc.close();

    }

    public static void main(String[] args) {
        evenAndOddNumber evenAndOddNumber = new evenAndOddNumber();
//        evenAndOddNumber.printSingleEvenOrOdd();
//        evenAndOddNumber.printEvenAndOdd();
        evenAndOddNumber.printNumberFromInputClass();
    }
}
