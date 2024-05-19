package Java8_Stream;

    import java.util.stream.Stream;
    public class StreamCreationExample {
        public static void main(String[] args) {
            // Creating a stream with multiple integers
            Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);

            // Counting elements in the stream
            long count = streamOfNumbers.count();
            System.out.println("Count: " + count); // Output: 7
        }
    }


