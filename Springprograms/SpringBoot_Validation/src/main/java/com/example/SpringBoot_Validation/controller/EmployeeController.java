package com.example.SpringBoot_Validation.controller;


import com.example.SpringBoot_Validation.entity.Employee;
import com.example.SpringBoot_Validation.exception.ResourceNotFoundException;
import com.example.SpringBoot_Validation.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository ;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees ()  {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable( value = "id")long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public Employee createEmployee (@Valid @RequestBody Employee employee ) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee (@PathVariable (value = "id")long employeeId ,
                                                    @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException ("Employee not found For this Id ::" + employeeId));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}


/*

 GET   :   Read/retrieve resources.
 POST  :  Create new resources.
 PUT   :  Update existing resources or create new ones if they do not exist.
DELETE :  Remove resources.

*/

/*

 @RequestBody :-  @RequestBody is an annotation in Spring (a popular Java framework)
 that is used in web applications to bind the body of an HTTP request to a method parameter.
 In simple terms, it allows you to take the data sent in an HTTP request
 (such as a JSON object) and map it directly to a Java object.

*/


