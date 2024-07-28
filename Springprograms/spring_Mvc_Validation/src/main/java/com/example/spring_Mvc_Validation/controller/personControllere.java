package com.example.spring_Mvc_Validation.controller;


import com.example.spring_Mvc_Validation.Repos.PersonRepository;
import com.example.spring_Mvc_Validation.entity.Person;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PersonDetail")
public class personControllere {

    @Autowired
    private PersonRepository personRepository ;

    @PostMapping("/persons")
    public Person createPerson (@Valid @RequestBody Person person)
    {
        return personRepository.save(person);
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons ()  {
        return (List<Person>) personRepository.findAll();
    }

    @GetMapping ("/persons/{id}")
    public ResponseEntity<Person> getPersonById (@PathVariable(value = "id" ) int personId)
    {
        Person person = personRepository.findById(personId).get();
        return ResponseEntity.ok().body(person);
    }

}
