package Class6;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 9, 14, 15, 1, 8, 5};
        int max = 0;
        int sLargest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                sLargest = max;
                max = numbers[i];
            }
        }
        System.out.println(sLargest);
    }

}
