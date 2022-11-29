package com.solvd.service.comp;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Notebook extends Comp {

    private boolean touchScreen;

    public void inputData() {
        setManufacturer("Lenovo");
        setModel("15ACH6 82K200HERE");
        setYear(2022);
        setTouchScreen(true);
    }

    public String toString() {
        String with;
        if (touchScreen == true) with = "with";
        else with = "without";
        return "Notebook " + manufacturer + ", " + model + " " +
                with + " Touch Screen, " + year + " year";
    }
}
