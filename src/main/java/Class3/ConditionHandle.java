package Class3;

import java.util.Scanner;

public class ConditionHandle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Number : ");
        int cash=sc.nextInt();
        if (cash<=10){
            System.out.println("Can not buy!! Need more money");
        }
        else if (cash>=10 && cash<50) {
            System.out.println("Can get one item");
        }
        else {
            System.out.println("can get both");
        }
        sc.close();
    }
}
