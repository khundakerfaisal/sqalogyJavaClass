package OOPClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class manupulationStringClass {
    public static void main(String[] args) {
        String myName="amin";

        //Contain Method
        if (myName.contains("amin")){
            System.out.println("Found Succeessfully");
        }
        //equal method
        if (myName.equals("samim")){
            System.out.println("Name match");
        }
        else {
            System.out.println("wrong name found");
        }
        //End contain and equal method

        System.out.println(myName.length());
        System.out.println(myName.charAt(2));
        System.out.println(myName.indexOf('i'));
        System.out.println(myName.replace('a','b'));
        System.out.println(myName.replaceAll("amin","samim"));
        System.out.println(myName.substring(0,1));
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());

        //To char array
        String name = "Samim";
        char[] characters = name.toCharArray();
        for (char c : characters) {
            System.out.println(c);
        }
        //End to char array

        //String builder class
        StringBuilder sb=new StringBuilder();
        sb.append("Java");
        sb.append(" is awesome!");
        System.out.println(sb);
        //String builder class end

        //Finding Split value
        String full_name = "Samim Amin Khan";
        String[] value = full_name.split("\\s");
        System.out.println(Arrays.toString(value));
        //End split method


    }

}
