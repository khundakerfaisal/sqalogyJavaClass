package SqalogyClasses;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class classCheckPractise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int generateAutoNumber= (int) (Math.random()*100);
        System.out.println(generateAutoNumber);
        System.out.println("Please input number : ");
        int inputNumber=sc.nextInt();

        if (inputNumber==generateAutoNumber){
            System.out.println("Number is matched");

        }
        else {
            System.out.println("your number is not matched");
        }
        String name="faisal-isp";
        String spliterName= name.replace("-","");
        System.out.println(spliterName);

//        System.out.println(name.substring(0,6));

    }
}
