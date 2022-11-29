package com.solvd.service.comp;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Monoblock extends Comp{

    private boolean touchScreen;
    @Override
    public void inputData() {
        setManufacturer("Acer");
        setModel("Aspire C24-1650 DQ.BFTMC.00C");
        setYear(2021);
        setTouchScreen(false);
    }
    public String toString() {
        String with;
        if (touchScreen == true) with = "with";
        else with = "without";
        return "Monoblock " + manufacturer + ", " + model + " " +
                with + " Touch Screen, " + year + " year";
    }
}
