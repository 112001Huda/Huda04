package Collectionprog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listtomap {
    public static void main(String[] args) {
        List<String> myList = List.of("apple", "banana", "cherry", "date");

        Map<String, Integer> lengthMap = new HashMap<>();
        for (String item : myList) {                                     // Applied ITERATOR
            lengthMap.put(item, item.length());
        }

        System.out.println(lengthMap);
    }
}
