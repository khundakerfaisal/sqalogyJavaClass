package SqalogyClasses;

public class reverseStringClass {
    public static void main(String[] args) {
        String areaName="Dhaka";
        StringBuilder sb=new StringBuilder(areaName);
        String reverseName=sb.reverse().toString();
        System.out.println("Using String builder function " +reverseName);


    }
}
