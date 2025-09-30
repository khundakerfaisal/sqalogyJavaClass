package Class7;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4},
                {4, 5}
        };

        System.out.println("All values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
//        for (int i = 0; i < arr.length; i++) {        // row loop
//            for (int j = 0; j < arr[i].length; j++) { // column loop
//                System.out.print(arr[i][j] + " ");
//            }
//        }
    }
}
