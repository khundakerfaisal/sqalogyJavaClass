package Class5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number : ");
        int number=sc.nextInt();
        boolean flag=true;
        for (int i=2;i<number/2;i++){
            if (number%i==0){
                flag=false;
                break;

            }
        }
        if (flag==true){
            System.out.println(number +" is Prime");
        }else {
            System.out.println(number + " is not prime");
        }

    }
}
