package problemSolvingJava;

import java.util.Scanner;

public class prmeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");

        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num / 2; i++) {

            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println(num + "is prime");
        } else {
            System.out.println(num + "is not prime");
        }
    }
}
