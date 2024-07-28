package com.example.Spring_Rest.Services;

import com.example.Spring_Rest.Repository.StudentRepository;
import com.example.Spring_Rest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceimpl  implements StudentService{

    @Autowired
    private StudentRepository studentRepository ;

    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>)
                studentRepository.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent (Student student , Long studentRollNumber ) {
        Student stuDB = studentRepository.findById(studentRollNumber).get();
        if (Objects.nonNull(student.getStudentName()) &&!"".equalsIgnoreCase( student.getStudentName()))
        { stuDB.setStudentName( student.getStudentName());

        }

        if (Objects.nonNull(

                student.getStudentAddress())

                &&!"".equalsIgnoreCase(

                student.getStudentAddress())) {

            stuDB.setStudentAddress(

                    student.getStudentAddress());

        }

        stuDB.setStudentAge(student.getStudentAge());

        stuDB.setStudentSubject(student.getStudentSubject());

        return studentRepository.save(stuDB);
    }

    @Override
    public void deleteStudentByRollNumber(Long studentRollNumber) {
        studentRepository.deleteById(studentRollNumber);
    }

}
