package com.example.SpringMany_Many.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Patient_MtoM")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {

    @Id
    private int patientId ;
    private String patientName ;
    @ManyToMany
    private Set<Doctor> Doctors = new HashSet<>();



}
