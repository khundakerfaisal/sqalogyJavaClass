package Class2;

import java.util.Arrays;

public class MethodProgram {
    //    public static int addNumber(int a,int b){
//        return a+b;
//    }
//
//    public static void main(String[] args) {
//        int sum=addNumber(5,10);
//        System.out.println(sum);
//    }
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

        int[] number = {1, 2, 4, 5, 6};
        System.out.println(number[0]);


        int[] numbers = {100, 80, 99, 56, 62, 24, 39, 40, 17};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }


}
