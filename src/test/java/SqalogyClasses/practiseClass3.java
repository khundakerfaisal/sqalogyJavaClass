package SqalogyClasses;

import java.util.Random;
import java.util.Scanner;

public class practiseClass3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String generateNumber= String.valueOf(Math.round(Math.random()*100));
        System.out.println(generateNumber);

        String inputNumber = "";

        while (!inputNumber.equals(generateNumber)){
            System.out.println("Input Number :");
            String InputNumber=sc.nextLine();
            if (InputNumber.equals(generateNumber)){
                System.out.println("Yahoo!! You are input correct Number");
            }else {
                System.out.println("Your are input wrong number");
            }
        }


    }

}
