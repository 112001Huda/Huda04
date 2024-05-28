package Collectionprog.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listpro {
    public static void main(String[] args) {

// ARRAYLIST :-

        List<String> Array1 = new ArrayList<>(4);
        Array1.add("Huda");
        Array1.add("Teju");
        Array1.add("Sona");
        Array1.add("Shreya");
        Array1.add("Shraddha");            // INternally increasing the sizr of array
        Array1.add("Vaishali");

        System.out.println("\nPrinting Array : "+Array1+"\n");


 // LINKEDLIST :-

        List<String> Link = new LinkedList<>();
        Link.add("04");
        Link.add("11");
        Link.add("13");
        Link.add("56");
        Link.add("26");
        Link.add("46");

        System.out.println("Linked List : "+Link+"\n");


// VECTOR :-

        List<String> vector = new Vector<>(2);
        vector.add("aa");
        vector.add("bb");
        vector.add("cc");              // Vector can also grow & Shrink automatically.
        vector.add("dd");
        vector.add("ee");
        vector.add("ff");

        System.out.println("Vector : "+vector.size()+"\n");

    }
}
