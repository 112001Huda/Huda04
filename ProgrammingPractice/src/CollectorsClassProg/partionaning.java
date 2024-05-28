package CollectorsClassProg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partionaning {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Huda","Teju","Nisha","Gauri","Sona","Shreya");

        Map<Boolean,List<String>> info = string.stream().collect(Collectors.partitioningBy(x -> x.length()> 4));
        System.out.println(info);
    }
}
