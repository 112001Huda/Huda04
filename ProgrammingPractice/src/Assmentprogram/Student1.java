package Assmentprogram;

import java.util.*;
import java.util.stream.Collectors;

public class Student1 {
        private int id;
        private String name;
        private String department;
        private String gender;
        private int marks;

        public Student1(int id, String name, String department, String gender, int marks) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.gender = gender;
            this.marks = marks;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getGender() {
            return gender;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "Student1{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", gender='" + gender + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }
    class huda {
        public static void main(String[] args) {

            List<Student1> students = new ArrayList<>();
            students.add(new Student1(1, "Huda", "a", "Female", 85));
            students.add(new Student1(2, "Teju", "c", "Female", 90));
            students.add(new Student1(3, "Shreya", "b", "Female", 82));
            students.add(new Student1(4, "Sonii", "d", "Female", 92));
            students.add(new Student1(5, "Vaishali", "c", "Female", 87));
            students.add(new Student1(6, "Shraddha", "d", "Female", 91));
            students.add(new Student1(7, "Alice", "b", "Female", 88));
            students.add(new Student1(8, "Bob", "a", "Male", 92));
            students.add(new Student1(9, "Charlie", "c", "Male", 86));
            students.add(new Student1(10, "Diana", "b", "Female", 99));
            students.add(new Student1(11, "Eve", "d", "Female", 86));
            students.add(new Student1(12, "Frank", "a", "Male", 71));

/*
// STREAM :

            Map<String, Optional<Student1>> highestMarksByDept = students.stream()
                    .collect(Collectors.groupingBy(Student1::getDepartment,
                            Collectors.maxBy((s1, s2) -> s1.getMarks() - s2.getMarks())));


            highestMarksByDept.forEach((dept, student) -> {
                System.out.println("Department: " + dept);
                student.ifPresent(s -> System.out.println("Highest Marks Student: " + s));
            });

*/


 // COLLECTION :

            Map<String, Student1> highestmark = new HashMap<>();

            for (Student1 student : students) {
                String dept = student.getDepartment();
                if (!highestmark.containsKey(dept) || highestmark.get(dept).getMarks() < student.getMarks()) {
                    highestmark.put(dept, student);
                }
            }

            // Print the result
           highestmark.forEach((dept, student) -> {
                System.out.println("Department: " + dept);
                System.out.println("Highest Marks Student: " + student);
            });


        }
    }

