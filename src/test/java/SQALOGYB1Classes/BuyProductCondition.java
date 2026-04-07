package SQALOGYB1Classes;

import java.util.Scanner;

public class BuyProductCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the number : ");
        int number=sc.nextInt();
        if (number>100){
            System.out.println("Can get 2 product");
        }
        else if (number>50){
            System.out.println("Can get 1 product");

        }
        else {
            System.out.println("Make more money to buy");
        }



    }
}
