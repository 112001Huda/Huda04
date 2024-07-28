package com.example.SpringMany_Many.controller;


import com.example.SpringMany_Many.entity.Doctor;
import com.example.SpringMany_Many.services.DoctorService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DoctorDetails")
public class DoctorController {

    @Autowired
    public DoctorService doctorService;

    @PostMapping("/SaveDoctor")
    public ResponseEntity<String> saveDoctor(@RequestBody Doctor doctor) {
        int id = doctorService.saveDoctor(doctor);
        return new ResponseEntity<>("Doctor with " + id + "has been saved", HttpStatus.OK);
    }

    @GetMapping("/getDoctor")
    public ResponseEntity<List<Doctor>> getAllDoctorDetails() {
        List<Doctor> list = doctorService.getAllDoctor();
        return new ResponseEntity<List<Doctor>>(list, HttpStatus.OK);
    }

    @GetMapping("/getDoctorById/{doctorId}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable("doctorId") Integer doctorId) {
        Doctor doctor = doctorService.getDoctorById(doctorId);
        return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
    }

    @PutMapping("/updateDoctor/{doctorId}")
    public Integer updateDoctor(@PathVariable("doctorId") int doctorId, @RequestBody Doctor doctor) {
        Doctor doctorFromDb = doctorService.getDoctorById(doctorId);
        doctorFromDb.setDoctorName((doctor.getDoctorName()));

        Integer integer = doctorService.saveDoctor(doctor);

        return integer;
    }

    @DeleteMapping("deleteDoctor/{doctorId}")
    public ResponseEntity<String> deleteDoctor(@PathVariable("doctorId") Integer doctorId) {
        doctorService.deleteDoctor(doctorId);
        return new ResponseEntity<String>("Doctor with " + doctorId + "has been deleted", HttpStatus.OK);
    }
}