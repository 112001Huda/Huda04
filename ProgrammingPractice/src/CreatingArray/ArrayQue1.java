package CreatingArray;

import java.util.Arrays;

public class ArrayQue1 {
    public static void main(String[] args) {
        int [] array1 = {1322,1856,1545,1854,1564,1445,1985,1999};
        String [] array2 = {"volvo", "Range rover", "Land Cruser","Bmw"};
        System.out.println("Given Input for Numeric array : " + Arrays.toString(array1) );
        Arrays.sort(array1);
        System.out.println("Sorted Numeric Array : " +Arrays.toString(array1));
    }
}
