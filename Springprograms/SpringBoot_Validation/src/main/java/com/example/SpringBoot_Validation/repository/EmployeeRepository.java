package com.example.SpringBoot_Validation.repository;


import com.example.SpringBoot_Validation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long  > {
}
