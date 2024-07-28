package com.example.spring_Mvc_Validation.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private int personId ;

    @NotBlank
    private String firstName ;

    @NotEmpty
    private String lastName ;

    @Min(21)
    @Max(40)
    private int age ;

    @Email
    @Size(min = 2 ,max = 40 ,message = "EMail contains in between 2 to 40 letters")
    private String email ;

    @Pattern(regexp = "^[a-zA-Z0-9!@#*]{6,10}$")
    private String password ;

}
