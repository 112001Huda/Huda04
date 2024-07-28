package com.example.SpringMany_Many.services;


import com.example.SpringMany_Many.entity.Patient;
import com.example.SpringMany_Many.repos.PatientRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository ;

    public Integer savePatient(Patient patient) {
        return patientRepository.save(patient).getPatientId();
    }

    public List<Patient> getAllPatient (){
        return (List<Patient>) patientRepository.findAll();
    }

    public Patient getPatientById (Integer patientId){
        return patientRepository.findById(patientId).get();

    }

    public void deletePatient (Integer patientId) {
         patientRepository.deleteById(patientId);
    }
}
