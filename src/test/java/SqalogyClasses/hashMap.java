package SqalogyClasses;

import java.util.HashMap;
import java.util.HashSet;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Retrieve a value by key
        System.out.println(map.get("Banana"));  // Output: 2

        // Check if a key exists
        System.out.println(map.containsKey("Apple"));  // Output: true

        // Remove a key-value pair
        map.remove("Orange");

        // Size of the HashMap
        System.out.println(map.size());  // Output: 2
    }

}
