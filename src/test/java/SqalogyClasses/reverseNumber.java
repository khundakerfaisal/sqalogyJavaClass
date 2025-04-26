package SqalogyClasses;

public class reverseNumber {
    public static void main(String[] args) {
        int number = 543, reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            System.out.println("first type" +rem);
            number = number / 10;
            System.out.println("second type" +number);
            reverse = reverse * 10 + rem;
            System.out.println(reverse);
        }
    }
}


