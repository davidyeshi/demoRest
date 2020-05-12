package com.example.demoRest.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Could not find Order " + id);
    }
}
