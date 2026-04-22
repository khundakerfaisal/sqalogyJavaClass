package SQALOGYB1Classes;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=768;
        StringBuilder sb=new StringBuilder(String.valueOf(number));
        String reverse=sb.reverse().toString();
        System.out.println(reverse);
    }
}
