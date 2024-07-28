//  3create array  and print  unique no in array , common values in array

package Assmentprogram;

import java.util.ArrayList;
import java.util.HashSet;

public class Array1 {
/*
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = {2, 4, 5, 6, 8, 9};

        System.out.println("Common values among arrays: " + findCommonValues(arr1, arr2, arr3));
    }

    // Method to find common values among arrays
    public static ArrayList<Integer> findCommonValues(int[] array1, int[] array2, int[] array3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        // Add elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Add elements of array2 to set2 and find common elements
        for (int num : array2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        // Add elements of array3 to common if they exist in set2
        for (int num : array3) {
            if (set2.contains(num)) {
                common.add(num);
            }
        }

        // Return common values as ArrayList
        return new ArrayList<>(common);
    }
}


*/


/*

    public static void main(String[] args) {
        // Define three arrays
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};
        int[] array3 = {6, 7, 8, 9, 10, 11};

        // Print common values among arrays
        System.out.println("Common values among arrays: ");
        findCommonValues(array1, array2, array3);
    }

    // Method to find common values among arrays
    public static void findCommonValues(int[] array1, int[] array2, int[] array3) {
        // Loop through each element in array1
        for (int num : array1) {
            // Check if the element exists in array2
            if (contains(array2, num)) {
                // If yes, check if it also exists in array3
                if (contains(array3, num)) {
                    // If yes, print it as a common value
                    System.out.print(num + " ");
                }
            }
        }
    }

    // Method to check if an array contains a specific element
    public static boolean contains(int[] array, int num) {
        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // If the element is found, return true
            if (array[i] == num) {
                return true;
            }
        }
        // If not found, return false
        return false;
    }
}

*/
}