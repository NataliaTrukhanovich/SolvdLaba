package com.solvd.service.repair;

public class Diagnostics implements IDiagnose {

    @Override
    public void diagnoseProcess(int timeForDissambling, int timeForAssambling) {
        System.out.println("Time for diagnostics " + (timeForAssambling + timeForDissambling) + " hours");
    }
}
