package com.example.SpringBoot_Validation.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;


@ControllerAdvice    /*  @ControllerAdvice  is a powerful feature in the Spring Framework
                    that allows you to handle exceptions globally, across the whole application,
                    not just to an individual controller. It can be used to define a class that
                    handles exceptions, binds data, and applies global configurations for the
                   whole application*/

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  /*
    ResponseEntityExceptionHandler is a convenient base class in the Spring Framework
    for handling exceptions in a RESTful way. It provides a default implementation for
    handling common Spring MVC exceptions and returning appropriate HTTP responses.
    By extending this class, you can customize exception handling for your application.
    */

/*    How to use  :-

    To use ResponseEntityExceptionHandler, you typically create a global exception handler class
    that extends it and override the methods to handle specific exceptions.
*/

    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

// @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), "Validation Failed",
                ex.getBindingResult().toString());
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
    }
}


/*    @EXCEPTION HANDLER :-

 is an annotation in the Spring Framework used to handle specific  exceptions thrown by your application.
 It can be applied at the method level within a controller to handle exceptions that occur within that controller
   */

/*     RESPONSE ENTITY :-

ResponseEntity is a powerful tool in the Spring Framework for handling HTTP responses.
It represents the entire HTTP response, including the status code, headers, and body.
This allows you to have complete control over the response that is returned from your controller methods.
        */
