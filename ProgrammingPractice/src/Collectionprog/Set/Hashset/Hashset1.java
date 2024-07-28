package Collectionprog.Set.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
        public static void main(String[] args) {
            // Creating  HashSet
            HashSet<String> set = new HashSet<>();

            //  Add values in HashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");
            set.add("Grapes");
            set.add("Lichi");
            set.add("Apple");
            set.add("Grapes");


            // Applying iterator HashSet
            Iterator<String> iterator = set.iterator();

            //
            System.out.println("Values in HashSet : ");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }


