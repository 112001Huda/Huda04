package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
public class StreamMapandSort {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add(0,"Huda");
        name.add(1,"Teju");
        name.add(2,"Sona");
        name.add(3,"Shraddha");
        name.add(4,"Shreya");
        name.add(5,"Vaishali");
        name.add(6,"Zoya");
        name.add(7,"Huda");
        name.add(8,"Shraddha");


 // MAP ()  :-
        name.stream().map(String::length).forEach(System.out::println);
        System.out.println("\n");

        name.stream().map(String::toUpperCase).distinct().forEach(System.out::println);

     //Sorting methods :-

 // SORTED  :-
        name.stream().sorted().forEach(System.out::println);
        System.out.println("\n");

 // SORTED ( Comparator ) :-
        name.stream().sorted((String names1 ,String names2) -> names1.length() - names2.length()).forEach(System.out::println);
    }
}
