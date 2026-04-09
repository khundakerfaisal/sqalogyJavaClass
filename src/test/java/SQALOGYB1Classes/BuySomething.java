package SQALOGYB1Classes;

import java.util.Scanner;

public class BuySomething {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount :");
        int cash=sc.nextInt();
        if (cash<=10){
            System.out.println("Can not buy chocolate need more money");
        } else if (cash>=11 && cash<50) {
            System.out.println("can buy two chocolate");

        }else {
            System.out.println("can get both");
        }
    }
}
