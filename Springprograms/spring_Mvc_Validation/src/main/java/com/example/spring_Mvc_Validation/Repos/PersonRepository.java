package com.example.spring_Mvc_Validation.Repos;

import com.example.spring_Mvc_Validation.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person , Integer> {
}
