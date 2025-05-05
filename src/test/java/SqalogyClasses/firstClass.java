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
//        try{
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Please input number");
//            int number =sc.nextInt();
//            System.out.println(number);
//
//
//        }catch (Exception e) {
//            System.out.println("You are input double Number");
//        }finally {
//            System.out.println("Please input actual integer number ");
//        }


//                widening casting

        int num=40;
        double number1=num;
        System.out.println(number1);

//                Narrowing casting

        float price=300.50f;
        int mainPrice=(int)price; //casting
        System.out.println(mainPrice);
//        Arethmatic Operator
        int a=6;
        int b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

//        assignment operator

        int c=10;
        System.out.println("inatial value is"+c);
        System.out.println(c+=5);
        System.out.println(c);
        System.out.println(c-=3);

//        comparison operator
        System.out.println("The value condition is :" +(a<b));
        System.out.println("The value condition is:" +(a>b));
//        logical operator
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input age ..:");
        int value =sc.nextInt();
        boolean age = value<=16;
        if (age){


            System.out.println("You are input the wrong age");

        }
        else {
            System.out.println("You are input the correct age");
        }
//Bit wise Operator
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011
        System.out.println(a & b);


    }

}

