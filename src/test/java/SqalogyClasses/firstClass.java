package SqalogyClasses;

import java.util.Scanner;

public class firstClass {
//    static String gender="male";//Static
//    String fName; //instance Variable
//    int age;
    public static void main(String[] args) {
//        firstClass fc=new firstClass();
//        String name="Arman";//local variable
//        System.out.println(name);
//        System.out.println(gender);
//        System.out.println(fc.fName="Arif");
//        System.out.println(fc.age=30);
//        int age=30;
//        char grade='A';
//        float height=5.90f;
//        boolean isPassed=true;
//        System.out.println(age);
//        System.out.println(grade);
//        System.out.println(height);
//        System.out.println(isPassed);

//        String name = "Alice";        // String object
//        int[] scores = {85, 90, 95};  // Array of integers
//
//        System.out.println("Name: " + name);
//        System.out.println("Scores:");
//        for (int score : scores) {
//            System.out.println(score);
//        }
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Please input number");
            int number =sc.nextInt();
            System.out.println(number);


        }catch (Exception e) {
            System.out.println("You are input double Number");
        }finally {
            System.out.println("Please input actual integer number ");
        }
    }

}

