package Class2;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapHashSet {
    public static void main(String[] args) {

        HashSet<Integer> number=new HashSet<>();
        number.add(10);
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println(number);

        HashMap<String,Integer> Marks=new HashMap<>();
        Marks.put("A+",80);
        Marks.put("A",70);
        Marks.put("A-",65);
        Marks.put("F",40);
        System.out.println(Marks);
        System.out.println(Marks.get("A"));
    }
}
