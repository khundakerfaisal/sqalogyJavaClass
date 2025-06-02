package SqalogyClasses;

import java.util.Arrays;

public class stringManupulation {
    public static void main(String[] args) {
        String name= "Mamun";
        char [] check= name.toCharArray();
        char findIndex=name.charAt(3);
        System.out.println(Arrays.toString(check));
        System.out.println(check[2]);
        System.out.println(findIndex);

    }
}
