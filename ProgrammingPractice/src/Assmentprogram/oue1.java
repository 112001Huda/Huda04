//

package Assmentprogram;

import java.util.HashMap;
import java.util.Map;

public class oue1 {
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
        huda.put(10,86);

        System.out.println("Map: " + huda);
        int sum = 0;
        for (int value :huda.values()) {
            sum += value;
        }
        System.out.println("Sum of all values : " + sum);


// collection for keys
        int sum11 = 0 ;
        for (int keys : huda.keySet()) {
            sum11 += keys ;
        }
        System.out.println("sum of keys : "+sum11);


// stream


        int sum1 = huda.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of values : " +sum1);


        int sum12 = huda.keySet().stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of keys : " +sum12);



    }
}