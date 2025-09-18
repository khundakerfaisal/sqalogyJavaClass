package Class1;

import java.util.Scanner;

public class MatchNumberProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Input the number: ");
            int MatchNumber=sc.nextInt();
            if (MatchNumber==16){
                System.out.println("Yahoo!! You entered the correct number");
                break;
            }
            else {
                System.out.println("You input wrong number ");
            }
        }
    }
}
