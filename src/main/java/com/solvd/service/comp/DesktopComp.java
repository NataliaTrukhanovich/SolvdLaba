package com.solvd.service.comp;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DesktopComp extends Comp {

    private String graphicsCard;

    @Override
    public void inputData() {
        setManufacturer("HP");
        setModel("290 G3 SFF 6B223EA");
        setYear(2021);
        setGraphicsCard("NVIDIA GeForce GTX 1650");
    }

    public String toString() {
        return "Desktop computer " + manufacturer + ", " + model + ", " +
                graphicsCard + ", " + year + " year";
    }
}
