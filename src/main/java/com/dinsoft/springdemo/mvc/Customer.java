package com.dinsoft.springdemo.mvc;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by din on 12.04.17.
 */
public class Customer {

    @NotNull()
    @Size(min=1, message = "is required")
    private String lastName;
    private String firstName;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
