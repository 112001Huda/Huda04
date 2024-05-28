package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationoperation {
    public static void main(String[] args) {

// Creating an Empty Stream  :  Retuen an empty Stream of type t
        Stream<String> emptyStream = Stream.empty();
        System.out.println(emptyStream.count());

// Creating Stream of single element  :  Return a single element of type t

        Stream<String> singleelement = Stream.of(new String("Huda"));
        System.out.println(singleelement.count());

// Creating stream of Int values : Return a Stream  of given values as element

        Stream<Integer> Streamofnos = Stream.of(11,4,13,30,26,66,56);
        System.out.println(Streamofnos.count());


// Creating stream from collection : Creating Stream from List .

        List<String> name = new ArrayList<>();
        name.add(0,"Huda");
        name.add(1,"Teju");
        name.add(2,"Sona");
        name.add(3,"Shraddha");
        name.add(4,"Shreya");
        name.add(5,"Vaishali");
        name.add(6,"Zoya");
        name.add(7,"shona");
        name.add(8,"Nisha");

    name.stream().forEach(System.out::println);

    }
}
