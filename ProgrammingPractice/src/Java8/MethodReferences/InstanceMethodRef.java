package Java8.MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodRef {
    public static void main(String[] args) {
        List<String> List1 = new ArrayList<>();
        List1.add("Huda");
        List1.add("Sona");
        List1.add("Teju");
        List1.add("Shraddha");
        List1.add("123");
        List1.add("456");
        List1.add("789");

        List1.replaceAll(String::toUpperCase);  // Replace all the element to upper case by using Method Reference
        List1.forEach(System.out::println);     // printing each element in list
        System.out.println("\n");

        List1.stream().sorted().filter(List1::contains).forEach(System.out::println);
    }
}
