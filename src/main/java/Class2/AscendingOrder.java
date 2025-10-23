package Class2;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
//        int[] arr = {78, 34, 1, 3, 90, 34, 6, 55, 20};
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int[][] arr = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++){
                System.out.println(arr[i][j]);
            }

    }
}
