package Class2;

import java.util.Arrays;

public class StringManupulation {
    public static void main(String[] args) {
        String Name="Arash khan";
        System.out.println(Name.length());
        System.out.println(Name.charAt(2));
        System.out.println(Name.indexOf("s"));
        System.out.println(Name.contains("Arash"));
        System.out.println(Name.replace("A","s"));
        System.out.println(Name.replaceAll("[0-9]",""));
        System.out.println(Name.substring(0,2));
        System.out.println(Name.toLowerCase());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.trim());

        char[] ch=Name.toCharArray();
        for (char c:ch){
            System.out.println(c);
        }

        String [] splitValue=Name.split("//s");
        System.out.println(Arrays.toString(splitValue));

        StringBuilder sb=new StringBuilder(Name);
        String reverseName=sb.reverse().toString();
        System.out.println(reverseName);
        String checkName="abc";
        if (checkName.equals("abc")){
            System.out.println("Found");
        }




    }
}
