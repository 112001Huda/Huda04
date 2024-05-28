package CollectorsClassProg;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Unmodified {
    public static void main(String[] args) {
        List<String> info = Arrays.asList("Huda","Teju","Nisha","Gauri","Sona","Shreya");


        List<String> list = info.stream().collect(Collectors.toUnmodifiableList());


        Set<String> set = info.stream().sorted().collect(Collectors.toUnmodifiableSet());
    }
}
