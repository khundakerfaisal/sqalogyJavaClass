package SQALOGYB1Classes;

import java.util.Arrays;
import java.util.HashSet;

public class hashSetprogramb1 {
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();
        number.add(10);
        number.add(10);
        number.add(20);
        number.add(30);
        Integer[] arr = number.toArray(new Integer[0]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
