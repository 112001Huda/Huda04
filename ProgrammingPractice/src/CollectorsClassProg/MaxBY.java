package CollectorsClassProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxBY {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>(Arrays.asList("Huda","Teju","Nisha","Gauri","Sona","Shreya"));
        String maxby =  string.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .get();
        System.out.println("The MaxBy Value is : "+maxby);
    }
}
