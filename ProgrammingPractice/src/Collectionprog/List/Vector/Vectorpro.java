package Collectionprog.List.Vector;

import java.util.Vector;

public class Vectorpro {
    public static void main(String[] args) {
        Vector <String> vec = new Vector<>();
        vec.add("Huda");
        vec.add("Teju");
        vec.add("Shreya");
        vec.add("Shraddha");
        vec.add("sona");
        vec.add("Vaishali  ");

        System.out.println("Element in Vector are : "+vec);
        System.out.println("\n");


        System.out.println("Getting 1st element : "+vec.get(0));
        System.out.println("\n");


        System.out.println("Removing the element : "+vec.remove(4));
        System.out.println("\n");


        System.out.println("Element in Vector :");
        for (String friends : vec ) {
            System.out.println(friends);

            System.out.println("size of Vector : "+vec.size()+"\n");


            System.out.println("capacity of Vector : "+vec.capacity()+"\n");


           // System.out.println("Add element : "+vec.add("zoya")+"\n");

            System.out.println("Element Contains or not : "+vec.contains("zoya"));


            System.out.println();
        }
    }
}
