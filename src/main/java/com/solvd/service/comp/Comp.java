package com.solvd.service.comp;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class Comp {
    protected String manufacturer;
    protected String model;
    protected int year;

    public abstract void inputData();
}
