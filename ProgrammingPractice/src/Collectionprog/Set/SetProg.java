package Collectionprog.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetProg {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("a");
        sets.add("b");
        sets.add("c");
        sets.add("d");
        sets.add("e");
        sets.add("f");
        sets.add("a");
        sets.add("b");

// PRINTING GIVEN SET :-

        System.out.println("printing the set : "+sets+"\n");

// INT SIZE () :-

        System.out.println("size of set : "+sets.size()+"\n");

// BOOLEAN ISEMPTY () :-

        System.out.println("set is empty or not : "+sets.isEmpty()+"\n");

// BOOLEAN CONTAINS () :-

        System.out.println("Contains specific element or not "+sets.contains("g")+"\n");

// BOOLEAN ADD () :-

        System.out.println("Adding the element : "+sets.add("g"));
        System.out.println(sets+"\n");

// BOOLEAN REMOVE () :-

        System.out.println("Removing the Element : "+sets.remove("f"));
        System.out.println(sets+"\n");

// OBJECT [] TOARRAY () :-

        String [] array = sets.toArray(sets.toArray(new String[0]));
        System.out.println(Arrays.toString(array)+"\n");

// BOOLEAN CONTAINSALL () :-

        List<String> StringList = Arrays.asList("a","b","c");
        boolean containall = sets.containsAll(StringList);
        System.out.println(containall+"\n");

// BOOLEAN EQUALS (OBJECT) :-

        System.out.println(sets.equals("gf")+"\n");

// INT HASHCODE () :-

        int hashcode = sets.hashCode();
        System.out.println(hashcode);
    }
}
