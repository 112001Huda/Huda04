package com.example.SpringBoot_Validation.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id ;
    @NotNull
    @Size(min = 2 , message = "First name should have at least 2 character ")
    private String firstName ;
    @NotNull
    @Size(min = 2 , message = "Last name should have at least 2 characters")
    private String lastName ;
    @Email
    @NotBlank
    private String emailId ;
    @NotNull
    @Size(min = 2 , message = "Passport Number should have at least 2 characters")
    private String passportNumber ;

// Constructor

    public Employee() {

    }
    public Employee(long id, String firstName, String lastName, String emailId, String passportNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.passportNumber = passportNumber;
    }


// Getter & Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
