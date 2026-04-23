package SQALOGYB1Classes;

import java.util.Arrays;

public class stringManupulationB1 {
    public static void main(String[] args) {
        String name="Bangladesh";
        System.out.println(Arrays.toString(name.toCharArray()));
        String country="I love Bangladesh";

        String [] arr=country.split("\\s");
        for (String s: arr){
            System.out.println(s);
        }

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('g'));
        System.out.println(name.substring(0,3));
        System.out.println(name.replace('g','j'));
        System.out.println(name.replaceAll("a","*"));
        if (name.contains("Bangla")){
            System.out.println("Contains 'Bangla'");
        }
        if(name.equals("Bangladesh")){
            System.out.println("Exact match");
        }

        String text = "abc123xyz456";
        String [] textArr=text.split("\\d+");
        for (String newText:textArr){
            System.out.println(newText);
        }

        StringBuilder sb=new StringBuilder("Hellow");
        sb.append(" world");
        sb.replace(0,6,"Hi");
        sb.reverse();
        sb.delete(0,1);
        System.out.println(sb);




    }
}
