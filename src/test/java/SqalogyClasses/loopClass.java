package SqalogyClasses;

import java.util.Random;
import java.util.Scanner;



public class loopClass {
    public static void main(String[] args) {
 //Start For Loop
        //        //Example: Start print 1 to 15 numbers
        //        System.out.println("Print 1 to 15 number");
        //        for(int i=1;i<=15;i++){
        //            System.out.println(i);
        //            }
        //        //Example: End print 1 to 15 numbers
        //
        //
        //        //Example: start print 15 to 1 numbers
        //        System.out.println("Print 15 to 1 number");
        //        for(int i=15;i>=1;i--){
        //            System.out.println(i);
        //        }
        //        //Example: End print 15 to 1 numbers
        //
        //
        //        //Example: Start Reverse triangle of numbers
        //        System.out.println("Print Reverse triangle of numbers");
        //        for(int i=5;i>=1;i--){
        //            for (int j=i;j>=1;j--){
        //                System.out.print(j+ " ");
        //            }
        //            System.out.println();
        //        }
        //Example: End Reverse triangle of numbers
 //End For Loop

 //Start while loop
        //        int j=100;
        //        while(j>=1){
        //            System.out.println(j);
        //            j=j-1;
        //        }

 //End while loop

//Start do-while loop
//-----------Example1: Do-While run 20 to 1
        //       int k=20;
        //        do {
        //            System.out.println(k);
        //            k=k-1;
        //        }
        //        while (k>=1);
//-----------Example1: End example 1

//-------------Example2: Do-While realtime example
            //        Scanner inputSc=new Scanner(System.in);
            //        int number=0;
            //        do {
            //            System.out.println("Input number :");
            //            number=inputSc.nextInt();
            //
            //            System.out.println("Here is your number :");
            //            System.out.println(number);
            //        }while (number>=0);
            //        System.out.println("The End");
//-----------Example2: End example 2
//End do-while loop
//Reverse Number
//        System.out.println("Reverse Entry Using for loop\n");
//                for (int i=10;i>0;i--){
//                    System.out.println(i);
//                }
//                int j=10;
//
//        System.out.println("Reverse Entry Using while loop\n");
//                while (j>4 && j<=10)
//                {
//                    System.out.println(j);
//                    j--;
//                }
//
//        System.out.println("Reverse Entry Using do-while loop\n");
//        int k=10;
//            do {
//                System.out.println(k);
//                k--;
//
//            }while (k>5);

//=====================Start the auto number ==================================
            //            String customer="customer-15";
            //            int nextNumber=Integer.parseInt(customer.split("-")[1]);
            //            int number= 5;
            //            for (int i=1;i<number;i++){
            //                int autoNumber=nextNumber+i;
            //                String newCustomer= "customer-"+autoNumber;
            //                System.out.println(newCustomer);
            //
            //            }
//=================End the auto number ====================

String name="fdjaskdjfdkfsdklfksdkfsdaf";
        System.out.println(name.charAt(4));//Find the character of index 4
        System.out.println(name.length());//find the full name length
        System.out.println(name.substring(0,6));//find the name begin to end index
        System.out.println(name.substring(21));//find the name with begin index

    }
}
