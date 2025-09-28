package Class5;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=543;
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}

