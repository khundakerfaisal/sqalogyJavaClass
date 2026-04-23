package SQALOGYB1Classes;

import java.util.HashMap;

public class HashMapProgramb1 {
    public static void main(String[] args) {
        HashMap<String,Integer> fruits=new HashMap<>();
        fruits.put("Mango",100);
        fruits.put("Orange",300);
        fruits.put("Apple",350);
        System.out.println(fruits.get("Mango"));
        System.out.println(fruits);
    }
}
