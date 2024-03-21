package CreatingArray;

import java.util.Arrays;

public class SortUsingloop {
    public static void main(String[] args) {
        int [] array = {11 , 10 , 4 , 34 , 56 , 45 , 22 , 78 };
        Arrays.sort(array);
        System.out.println("The sorted element arrry ");
        for (int i = 0 ; i < array.length ; i++ ) {
            System.out.print(array[ i ]+"  ");
        }
    }
}
