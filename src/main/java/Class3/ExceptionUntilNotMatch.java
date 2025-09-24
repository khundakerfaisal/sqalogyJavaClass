package Class3;

import java.util.Scanner;

public class ExceptionUntilNotMatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = 0;
        while (true) {
            try {
                System.out.println("Please input number : ");
                inputNumber = input.nextInt();
                System.out.println("Yahoo!! you are input correct data :" + inputNumber);
                break;
            }
            catch (Exception e) {
                System.out.println("You input double or wrong type!!");
                input.nextLine();
            }
        }
        input.close();
    }
}