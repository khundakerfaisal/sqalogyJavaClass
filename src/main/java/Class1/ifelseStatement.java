package Class1;

import java.util.Scanner;

public class ifelseStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int Amount=sc.nextInt();
        if (Amount<=10){
            System.out.println("Can not get anything");
        } else if (Amount>=10 && Amount<=50) {
            System.out.println("Can get 1 item");

        }
        else {
            System.out.println("Can get both");
        }
    }
}
