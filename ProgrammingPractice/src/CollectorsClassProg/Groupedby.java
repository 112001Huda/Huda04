package CollectorsClassProg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupedby {
    public static void main(String[] args) {
        List<String> info = Arrays.asList("Huda","Teju","Nisha","Gauri","Sona","Shreya","Shraddha");
        Map<Integer,List<String>> collect =info.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
