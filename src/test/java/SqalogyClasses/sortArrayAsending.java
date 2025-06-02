package SqalogyClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArrayAsending {
    public static void main(String[] args) {

        int [] ar={14,12,18,5,25,28,8};
        //Using sort method
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        //Using loop and temp veriable to swap
        for (int i=0;i<ar.length;i++){
            for (int j=i+1;j<ar.length;j++){
                if (ar[i]>ar[j]){
                       int temp=ar[i];
                       ar[i]=ar[j];
                       ar[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
