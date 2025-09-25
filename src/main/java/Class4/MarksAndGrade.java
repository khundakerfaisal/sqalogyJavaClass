package Class4;

import java.util.Scanner;

public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input The Marks : ");
        int marks;
        while (true) {
            marks = sc.nextInt();

            if (marks >= 80 && marks < 90) {
                System.out.println("Grade is A+");
                break;
            } else if (marks >= 70 && marks < 80) {
                System.out.println("Grade is A");
                break;
            } else {
                System.out.println("You are failed " + marks + " Grade F");
                sc.nextLine();
                break;

            }

        }
        sc.close();

    }

}


