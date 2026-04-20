package SQALOGYB1Classes;

import java.util.Scanner;

public class gradeProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        if (number>=40 && number<=50){
            System.out.println("Student pass the exam");
        } else if (number<=39) {
            System.out.println("Stdent fail the exam");

        }
    }
}
