package com.example.Spring_Rest.controller;


import com.example.Spring_Rest.Services.StudentService;
import com.example.Spring_Rest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @PostMapping("/students")
    public Student saveDepartment (@Validated @RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> fetchStudentList()
    {
        return studentService.fetchStudentList();
    }

    @PutMapping("/students/{rollNumber}")
    public Student updateStudent(@RequestBody Student student , @PathVariable ("rollNumber")Long studentRollNumber)
    {
        return studentService.updateStudent(student , studentRollNumber);
    }

    @DeleteMapping("/student/{rollNumber}")
    public String deleteStudentByRollNumber(@PathVariable("rollNumber")Long studentRollNumber)
    {
        studentService.deleteStudentByRollNumber(studentRollNumber);
        return "Deleted Successfully";
    }
}
