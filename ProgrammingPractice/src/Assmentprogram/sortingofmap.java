package Assmentprogram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class sortingofmap {
    public static void main(String[] args) {
        Map<Integer, Integer> huda = new HashMap<>();
        huda.put(1, 11);
        huda.put(2, 22);
        huda.put(3, 33);
        huda.put(4, 44);
        huda.put(5, 55);
        huda.put(6, 66);
        huda.put(7, 77);
        huda.put(8, 88);
        huda.put(9, 99);
        huda.put(10, 86);

        System.out.println("Map: " + huda);

        Map<Integer, Integer> ascendingMap = new TreeMap<>(huda);
        System.out.println("Map  sorted in ascending order: " + ascendingMap);


        Map<Integer, Integer> descendingMap = new TreeMap<>(Collections.reverseOrder());
        descendingMap.putAll(huda);
        System.out.println("Map sorted in desending : "+descendingMap);
    }
}




