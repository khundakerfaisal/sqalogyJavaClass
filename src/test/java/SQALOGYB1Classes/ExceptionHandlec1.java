package SQALOGYB1Classes;

import java.util.Scanner;

public class ExceptionHandlec1 {
    public static void main(String[] args) {
//        try{
//            Scanner sc=new Scanner(System.in);
//            int number=sc.nextInt();
//            System.out.println("Enter int number :" +number);
//
//        }
//        catch (Exception e){
//            System.out.println("Entered double number");
//        }
//        finally {
//            System.out.println("Please try without decimal value");
//        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Input day");
        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("sat");
                break;
            case 2:
                System.out.println("sun");
                break;
            default:
                System.out.println("wed-fri");
        }
    }
}
