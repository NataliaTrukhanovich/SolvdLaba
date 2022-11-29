package com.solvd.service.person;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class Person {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;

}
