package SqalogyClasses;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random= new Random();
        int generateNumber= random.nextInt(900000)+100000;
        String prefix="00181";
        String generateNid=prefix+generateNumber;
        System.out.println("The customer NID is :" +generateNid);
    }

}
