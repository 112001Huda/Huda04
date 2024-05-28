package CollectorsClassProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinBY {
    public static void main(String[] args) {
        List<Integer> info = new ArrayList<>(Arrays.asList(1,3,5,7,9,11,13,15));

        Integer minby = info.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
        System.out.println("minimum value is  : "+minby);

    }
}
