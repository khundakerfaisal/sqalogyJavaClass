package SQALOGYB1Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistProgram {
    public static void main(String[] args) {
        ArrayList<String> flower=new ArrayList<>();
        flower.add("Rose");
        flower.add("Bailey");
        flower.add("Lavendar");
        flower.add("sunflower");
        System.out.println(flower);
        System.out.println(flower.get(2));
        flower.remove("Rose");
        System.out.println(flower);



    }
}
