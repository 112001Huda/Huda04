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
@Table(name = "Doctor_MtoM")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {

    @Id
    private int doctorId ;
    private String doctorName ;
    @ManyToMany
    private Set<Patient> patients = new HashSet<>();


}
