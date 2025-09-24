package Class3;

import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number : ");
            int inputData=sc.nextInt();
            System.out.println("Yahoo!! you are input correct data :" +inputData);
        }
        catch (Exception e){
            System.out.println("You input double number!!");
        }
    }
}
