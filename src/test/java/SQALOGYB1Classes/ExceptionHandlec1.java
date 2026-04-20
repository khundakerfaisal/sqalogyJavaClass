package SQALOGYB1Classes;

import java.util.Scanner;

public class ExceptionHandlec1 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            System.out.println("Enter int number :" +number);

        }
        catch (Exception e){
            System.out.println("Entered double number");
        }
        finally {
            System.out.println("Please try without decimal value");
        }
    }
}
