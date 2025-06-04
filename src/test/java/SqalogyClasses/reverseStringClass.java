package SqalogyClasses;

public class reverseStringClass {
    public static void main(String[] args) {
        //Using String builder function
//        String areaName="akahd";
//        StringBuilder sb=new StringBuilder(areaName);
//        String reverseName=sb.reverse().toString();
//        System.out.println("Reverse name is " +reverseName);
//
//        //Using stractural program to reverse the name
//        char [] reverseCheck=areaName.toCharArray();
//        String reverse="";
//        for (int i=reverseCheck.length-1;i>=0;i--){
//            reverse +=reverseCheck[i];
//        }
//        System.out.println("The name is " +reverse);

        String areaName="Feni";
        StringBuilder sb=new StringBuilder(areaName);
        String reverName=sb.reverse().toString();
        System.out.println(reverName);
        char [] checkArea=areaName.toCharArray();
        String reverseName="";
        for (int i=checkArea.length-1;i>=0;i--){
            reverseName+=checkArea[i];


        }
        System.out.println(reverseName);
    }
}
