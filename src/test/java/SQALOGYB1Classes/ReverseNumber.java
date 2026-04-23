package SQALOGYB1Classes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
//        int number=768;
//        StringBuilder sb=new StringBuilder(String.valueOf(number));
//        String reverse=sb.reverse().toString();
//        System.out.println(reverse);
        Scanner sc=new Scanner(System.in);
        System.out.println("Input amount : ");
        int Amount=sc.nextInt();
        if (Amount<=10){
            System.out.println("can not buy icecream");
        } else if (Amount>11 && Amount<=50) {
            System.out.println("can buy icecream");

        }


    }
}
