package SqalogyClasses;

import java.util.Random;
import java.util.Scanner;

public class numberFindClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
//        System.out.println(myNumber);
        int userNumber=0;
        do {
            System.out.println("Guese the number : ");
            userNumber=sc.nextInt();
            if (userNumber == myNumber){
                System.out.println("Woohoo .. Correct the number !!!");
                break;
            }
            else if (userNumber>myNumber){
                System.out.println("User number is too large !!!");
            }
            else {
                System.out.println("your number is too small !!!");
            }
        }while (userNumber>=0);
        System.out.println("My number was : ");
        System.out.println(myNumber);


    }

}
