package Java8_Stream;

import java.util.stream.Stream;

//Stream.empty();    use
//stream.count
public class Student {
    // Attributes
    private String name;
    private int age;
    private String id;

    // Constructor
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student() {

    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Main method to demonstrate Stream.empty() usage
    public static void main(String[] args) {
        // Creating an empty stream of Student
        Stream<Student> emptyStream = Stream.empty();

        // Counting elements in the stream
        System.out.println(emptyStream.count()); // Output: 0


        // Creating a stream with a single Student object
        Stream<Student> singleElementStream = Stream.of(new Student());

        // Counting elements in the stream
        System.out.println(singleElementStream.count()); // Output: 1


        // Creating a stream with multiple integers
        Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);

        // Counting elements in the stream
        System.out.println(streamOfNumbers.count()); // Output: 7




    }



    }
