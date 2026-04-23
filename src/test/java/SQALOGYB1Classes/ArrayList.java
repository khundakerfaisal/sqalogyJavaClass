package SQALOGYB1Classes;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> fruits=new java.util.ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println(fruits.get(1));
        String [] arr=fruits.toArray(new String[0]);
        System.out.println(arr[1]);


    }
}
