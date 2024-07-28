package com.example.OnlineShopping.service;


import com.example.OnlineShopping.Repos.CustomerRepository;
import com.example.OnlineShopping.dtos.CustomerDTO;
import com.example.OnlineShopping.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository ;


// CREATE CUSTOMER
    public CustomerDTO createCustomer (CustomerDTO customerDTO )  {
        Customer customer = new Customer() ;
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        customer.setEmail(customerDTO.getEmail());

        customer = customerRepository.save(customer);
        customerDTO.setId(customer.getId());
        return customerDTO ;

    }

// GET CUSTOMER

    public CustomerDTO getCustomer (Long id )  {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer Not Found !!! "));
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setFirstName(customer.getFirstName());
        customerDTO.setLastName(customer.getLastName());
        customerDTO.setEmail(customer.getEmail());

        return customerDTO ;
    }

}
