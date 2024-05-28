package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class SelectionOperation {
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

// FILTER ()  :-

        name.stream().filter((String names) -> names.length()>=6).forEach(System.out::println);
        System.out.println("\n");

// DISTINCT ()  :-

        name.stream().distinct().forEach(System.out::println);
        System.out.println("\n");

// LIMIT () :-

        name.stream().limit(5).forEach(System.out::println);
        System.out.println("\n");

// SKIP ()  :-

        name.stream().skip(6).forEach(System.out::println);
    }
}
