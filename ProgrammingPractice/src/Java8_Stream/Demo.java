package Java8_Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.add("David");

        names.add("Brijesh");

//Selecting only unique names

        names.stream().distinct().forEach(System.out::println);

//  Output :

//  David
//  Johnson
//  Samontika
//  Brijesh
//  John
    }
}