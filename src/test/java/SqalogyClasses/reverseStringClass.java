package SqalogyClasses;

public class reverseStringClass {
    public static void main(String[] args) {
        //Using String builder function
        String areaName="akahd";
        StringBuilder sb=new StringBuilder(areaName);
        String reverseName=sb.reverse().toString();
        System.out.println("Reverse name is " +reverseName);

        //Using stractural program to reverse the name
        char [] reverseCheck=areaName.toCharArray();
        String reverse="";
        for (int i=reverseCheck.length-1;i>=0;i--){
            reverse +=reverseCheck[i];
        }
        System.out.println("The name is " +reverse);

    }
}
