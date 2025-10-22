package Class2;

import java.util.Arrays;

public class ArrayAscending {
    public static void main(String[] args) {
//        int[] arr = {78, 34, 1, 3, 90, 34, 6, 55, 20};
//        Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));
        int[] arr = {78, 34, 1, 3, 90, 34, 6, 55, 20};
        // Sorting the array using a simple swapping strategy
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Array elements after sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
