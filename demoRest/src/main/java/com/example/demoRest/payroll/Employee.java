package com.example.demoRest.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    // == fields ==
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    // == constructors ==
    Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
