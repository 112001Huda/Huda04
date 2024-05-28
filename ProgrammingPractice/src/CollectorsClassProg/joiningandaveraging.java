package CollectorsClassProg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningandaveraging
{
    public static void main(String[] args) {
        List<String> info = Arrays.asList("Huda", "Teju", "Nisha", "Gauri", "Sona", "Shreya");


        String collects = info.stream().collect(Collectors.joining(" , "));
        System.out.println(collects);

// Averaging long

        List<Integer> info1 = Arrays.asList(1,3,5,7,9,11);
        Double collects1 = info1.stream().collect(Collectors.averagingLong(x -> x * 2));
        System.out.println(collects1);
    }
}
