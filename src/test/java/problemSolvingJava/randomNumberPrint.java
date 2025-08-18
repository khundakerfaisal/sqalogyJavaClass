package problemSolvingJava;

import java.util.Random;

public class randomNumberPrint {
    public static void main(String[] args) {
        Random randomNumber=new Random();
        String generateNidNumber= String.valueOf(randomNumber.nextInt(999999)+111111);
        System.out.println(2001+generateNidNumber);
    }
}
