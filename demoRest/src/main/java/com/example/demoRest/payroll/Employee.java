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
    private String firstName;
    private String lastName;
    private String name;
    private String role;
    // == constructors ==

    Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    // == public methods ==

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}
