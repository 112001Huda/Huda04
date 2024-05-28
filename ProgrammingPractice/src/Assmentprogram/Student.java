package Assmentprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
        String name;
        int id;
        String division;
        String gender;
        int marks;

        public Student(String name, int id, String division, String gender, int marks) {
            this.name = name;
            this.id = id;
            this.division = division;
            this.gender = gender;
            this.marks = marks;
        }

        public static void sortStudentsByName(List<Student> students) {
            Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', id=" + id + ", division='" + division + "', gender='" + gender + "', marks=" + marks + "}";
        }

        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Huda", 1, "A", "Female", 99));
            students.add(new Student("Teju", 2, "B", "female", 90));
            students.add(new Student("sona", 3, "A", "female", 78));
            students.add(new Student("Shraddha", 4, "C", "female", 92));
            students.add(new Student("shreya", 5, "B", "Female", 88));
            students.add(new Student("vaishali", 6, "d", "female", 96));
            students.add(new Student("soni", 7, "A", "female", 78));
            students.add(new Student("zoya", 8, "C", "female", 90));
            students.add(new Student("zohan", 9, "B", "male", 80));
            students.add(new Student("vihan", 10, "d", "male", 90));
            students.add(new Student("zoha", 11, "A", "female", 78));
            students.add(new Student("vijay", 12, "d", "male", 85));
            students.add(new Student("aditya", 13, "B", "male", 98));
            students.add(new Student("anant", 14, "A", "male", 78));

/*
            System.out.println("Before sorting:");
            for (Student student : students) {
                System.out.println(student);
            }

            Student.sortStudentsByName(students);

            System.out.println("\nAfter sorting:");
            for (Student student : students) {
                System.out.println(student);
                */



                 }
        }




//sort by first name




