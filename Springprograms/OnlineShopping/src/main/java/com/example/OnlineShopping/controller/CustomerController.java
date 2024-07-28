package com.example.OnlineShopping.controller;


import com.example.OnlineShopping.dtos.CustomerDTO;
import com.example.OnlineShopping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService ;

@PostMapping
    public ResponseEntity<CustomerDTO> createCustomer (@RequestBody CustomerDTO customerDTO)  {
    CustomerDTO createdCustomer = customerService.createCustomer(customerDTO);
    return ResponseEntity.ok(createdCustomer) ;

}

@GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomer (@PathVariable Long id) {
    CustomerDTO customerDTO = customerService.getCustomer(id);
    return ResponseEntity.ok(customerDTO);
}


}
