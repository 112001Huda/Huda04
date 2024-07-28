package com.example.SpringMany_Many.controller;

import com.example.SpringMany_Many.entity.Doctor;
import com.example.SpringMany_Many.entity.Patient;
import com.example.SpringMany_Many.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PatientDetails")
public class PatientController {

    @Autowired
    public PatientService patientService ;


    @PostMapping("/SavePatient")
    public ResponseEntity<String> savePatient(@RequestBody Patient patient) {
        int id = patientService.savePatient(patient);
        return new ResponseEntity<>("Patient with " + id + "has been saved", HttpStatus.OK);
    }

    @GetMapping("/getPatient")
    public ResponseEntity<List<Patient>> getAllPatientDetails() {
        List<Patient> list = patientService.getAllPatient();
        return new ResponseEntity<List<Patient>>(list, HttpStatus.OK);
    }

    @GetMapping("/getPatientById/{patientId}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("PatientId") Integer patientId) {
        Patient patient = patientService.getPatientById(patientId);
        return new ResponseEntity<Patient>(patient, HttpStatus.OK);
    }

    @PutMapping("/updatePatient/{patientId}")
    public Integer updatePatient(@PathVariable("patientId") int patientId, @RequestBody Patient patient) {
        Patient patientFromDb = patientService.getPatientById(patientId);
        patientFromDb.setPatientName((patient.getPatientName()));

        Integer integer = patientService.savePatient(patient);

        return integer;
    }

    @DeleteMapping("deletePatient/{patientId}")
    public ResponseEntity<String> deletePatient(@PathVariable("patientId") Integer patientId) {
        patientService.deletePatient(patientId);
        return new ResponseEntity<String>("Patient with " + patientId + "has been deleted", HttpStatus.OK);
    }
}
