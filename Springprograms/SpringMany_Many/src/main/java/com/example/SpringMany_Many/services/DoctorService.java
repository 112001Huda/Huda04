package com.example.SpringMany_Many.services;


import com.example.SpringMany_Many.entity.Doctor;
import com.example.SpringMany_Many.repos.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository ;

    public Integer saveDoctor (Doctor doctor) {
        return doctorRepository.save(doctor).getDoctorId();
    }

    public List<Doctor> getAllDoctor (){
        return (List<Doctor>) doctorRepository.findAll();
    }

    public Doctor getDoctorById(Integer doctorId) {
        return doctorRepository.findById(doctorId).get();
    }

    public void deleteDoctor (Integer doctorId) {
        doctorRepository.deleteById(doctorId);
    }
}
