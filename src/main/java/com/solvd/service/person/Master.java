package com.solvd.service.person;

import lombok.Data;

@Data
public class Master extends Person {
    private int workExperience;

    public Master() {
        setId(1);
        setFirstName("John");
        setLastName("Smith");
        setPhone("34267");
        setWorkExperience(1);
    }

    public Master(String status) {
        setId(1);
        setFirstName("Jack");
        setLastName("Smith");
        setPhone("34256");
        setWorkExperience(5);
    }

    public String toString() {
        return "Your master: " + firstName + " " + lastName + ". Phone number: " + phone;
    }

}
