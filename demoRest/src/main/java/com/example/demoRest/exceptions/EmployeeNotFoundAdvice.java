package com.example.demoRest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody // this advice is rendered straight into the response body
    @ExceptionHandler(EmployeeNotFoundException.class) // only responds when this exception is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND) // HTTP 404
    String employeeNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }
}
