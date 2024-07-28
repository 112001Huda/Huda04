package com.example.SpringBoot_Validation.exception;

import java.util.Date;

public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}


// ErrorDetails : - we create an class to store the information about our errors in our application .
//  in it we gives timestamp ==  time , message ==  for which the exception comes  ,  details  ==  Whole details about Exception
// create getter for those properties in class