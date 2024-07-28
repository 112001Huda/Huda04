package com.example.SpringMany_Many.repos;


import com.example.SpringMany_Many.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Integer> {

}
