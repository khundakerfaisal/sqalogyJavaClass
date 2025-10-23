package Class2;

import java.util.Arrays;

public class ArrayManupulation {
    public static void main(String[] args) {
        int [] number1={10,20,40,50,60,70};
        int [] number2={40,60};
        int max1=0;
        int max2=0;
        for (int i=0;i<number1.length;i++){
            if (number1[i] > max1) {
                max1 = number1[i];
            }
        }
        for (int i=0;i<number2.length;i++){
            if (number2[i] > max2) {
                max2 =number2[i];
            }
        }
        System.out.println(Math.max(max1,max2));

        int num[]=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        for(int i=0;i<5;i++){
            System.out.println(num[i]);
        }

        int[] numbers={100,80,99,56,62,24,39,40,17};
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
}
