package com.example.SpringBoot_Validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    private final static long serialVersionUID = 1L ;

    public ResourceNotFoundException ( String message) {
        super(message);
    }
}


// create an custom exception for not null value to provide the details why exception occurs in application