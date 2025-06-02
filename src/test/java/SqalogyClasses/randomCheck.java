package SqalogyClasses;

import java.util.Random;

public class randomCheck {
    public static void main(String[] args) {
        //Using generate random number between 1 to 100 number
        int Number= (int) (Math.random()*100);
        System.out.println(Number);

        //Using generate random number between 100 to 200 number
        int min=100;
        int max=200;
        double randomId=Math.ceil(Math.random()*(max-min)+min);
        System.out.println("Random id is " +randomId);

        //Using generate random number with the bound data
        Random random=new Random();
        double generateNumber=Math.floor(random.nextInt(90000)+10000);
        System.out.println("New random number is " +generateNumber);


    }
}
