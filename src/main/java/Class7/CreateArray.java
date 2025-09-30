package Class7;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
        String [] arr=fruits.toArray(new String[1]);
        System.out.println(arr.length);
        System.out.println(arr[1]);


    }
}
