package Class6;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] numbers = {50, 80, 92, 15, 61, 10, 78, 28, 44};
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int index = random.nextInt(numbers.length);
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
