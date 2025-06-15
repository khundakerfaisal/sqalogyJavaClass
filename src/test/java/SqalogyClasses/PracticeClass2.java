package SqalogyClasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeClass2 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String matchNumber = String.valueOf(Math.round(Math.random() * 100));
//        System.out.println(matchNumber);
//        String userInput = "";
//        while (!userInput.equals(matchNumber)) {
//            System.out.println("Please enter number");
//            userInput=sc.nextLine();
//            if (userInput.equals(matchNumber)){
//                System.out.println("YAHOO!! You choose the correct number");
//
//            }
//        else{
//                System.out.println("You choose wrong Number ! Please entre again ..");
//            }
//        }

//        String name="Mamun";
//        StringBuilder sb=new StringBuilder(name);
//        String newName=sb.reverse().toString();
//        System.out.println(newName);

//        String name="Ata Bhai";
//        String reverseName="";
//        char []reverseCh=name.toCharArray();
//        for (int i=name.length()-1;i>=0;i--){
//            reverseName+=reverseCh[i];
//
//        }
//        System.out.println(reverseName);

        int[] number = {17, 14, 15, 12, 11, 16};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

//        for (int i = 0; i < number.length; i++) {
//            for (int j = i + 1; j < number.length; j++) {
//                if (number[i] > number[j]) {
//                    int temp = number[i];
//                    number[i] = number[j];
//                    number[j] = temp;
//                }
//            }
//            // Optional: to show progress after each outer loop
//            System.out.println("Step " + i + ": " + Arrays.toString(number));
//        }
//        System.out.println("Sorted array: " + Arrays.toString(number));

        String name = "This is _ remove";
        System.out.println(name.substring(0,7));
        String splitDigit=name.replace("_","");
        System.out.println(splitDigit);
    }
}
