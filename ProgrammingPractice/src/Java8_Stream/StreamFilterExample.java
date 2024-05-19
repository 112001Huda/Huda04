package Java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(7, 2, 6, 9, 4, 3, 1);

        // Filtering out even numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers); // Output: [7, 9, 3, 1]

        System.out.println("Odd Numbers: " + oddNumbers); // Output: [7, 9, 3, 1]
    }
}
