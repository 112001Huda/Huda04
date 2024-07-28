package com.example.SpringMany_Many.repos;


import com.example.SpringMany_Many.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer> {

}
