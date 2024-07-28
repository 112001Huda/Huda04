package Collectionprog.map;

import java.util.HashMap;

public class HashMapDuplicateExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value3");

        // Print the original HashMap
        System.out.println("Original HashMap: " + map);

        // Retrieve the old value for key2 before updating
        String oldValue = map.get("key2");

        // Adding a duplicate key with a new value
        map.put("key2", "newValue2");

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + map);

        // Retrieve the new value for key2
        String newValue = map.get("key2");

        // Print the old and new values for key2
        System.out.println("Old value for 'key2': " + oldValue);
        System.out.println("New value for 'key2': " + newValue);
    }
}
