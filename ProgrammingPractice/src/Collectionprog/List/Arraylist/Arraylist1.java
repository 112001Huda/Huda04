package Collectionprog.List.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Lichi");
        fruit.add("banana");
        fruit.add("pears");
        fruit.add("Grapes");
        fruit.add("Guava");

        System.out.println("Fruits are : " +fruit);

 // Iterating the given list
        System.out.println("Iterating the fruit list : ");
        for (String fruits : fruit){
            System.out.println(fruits);
        }

 //size of list in  :  int

        int size = fruit.size();
        System.out.println("\n size of list  :  "+size);

 // List is EMPTY  or not  :  boolean

        boolean Empty = fruit.isEmpty();
        System.out.println("\n The list is empty or not  :  "+Empty);

 // List contains the Element or not  :  boolean

        boolean contains = fruit.contains("black barry");
        System.out.println("\n The given Element is contain or not :  "+contains);

// Adding  element for specific index in List

        fruit.add(2,"Blackbarry");
        System.out.println("\n Adding the element to specific index  : " +fruit);

// Removing the specific element from the list

        fruit.remove("banana");
        System.out.println("\n Removing element from List :  " +fruit);

// CLEARING  the list :

        fruit.clear();
        System.out.println("\n Clearing the element in list  : "+fruit);
    }
}
