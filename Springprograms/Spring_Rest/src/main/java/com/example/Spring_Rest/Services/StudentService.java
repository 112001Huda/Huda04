package com.example.Spring_Rest.Services;

import com.example.Spring_Rest.entity.Student;

import java.util.List;

public interface StudentService {


    // Read operation
    List<Student> fetchStudentList();

    // Save operation
    Student saveStudent(Student department);

    // Update operation
    Student updateStudent (Student department, Long departmentId);

// Delete operation
    void deleteStudentByRollNumber(Long departmentId);

}
