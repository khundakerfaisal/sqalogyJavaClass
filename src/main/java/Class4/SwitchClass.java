package Class4;

import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input The Marks : ");
        int marks;
        while (true){
            marks= sc.nextInt();
            switch (marks){
                case 1:
                    if(marks>=80 && marks<90){
                        System.out.println("Grade is A+");
                    }
                    break;
                case 2:
                    if(marks>70 && marks<80){
                        System.out.println("Grade is A");
                    }
                    break;
                default:
                    System.out.println("You are failed " +marks +" Grade F");
                 break;
            }
        }

    }
}
