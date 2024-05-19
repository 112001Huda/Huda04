package Java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(7, 2, 6, 9, 4, 3, 1);

        // Doubling each number
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Doubled Numbers: " + doubledNumbers); // Output: [14, 4, 12, 18, 8, 6, 2]
    }
}
