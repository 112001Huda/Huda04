package CollectorsClassProg;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorMethod {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7,9,11,13,15);

        List<Integer> list = integers.stream().filter(b -> b > 6 ).collect(Collectors.toList());
        System.out.println("List : "+list+"\n");


       Set<Integer> set = integers.stream().map(a -> a/2 ).collect(Collectors.toSet());
        System.out.println("Set : "+set+"\n");


       Collection<Integer> collection = integers.stream().filter(x -> x > 6 ).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Collection in LinkedHashSet : " +collection+"\n");


        long collect = integers.stream().filter(h -> h < 10 ).collect(Collectors.counting());
        System.out.println("counting of stream : " +collect+"\n");




    }
}
