package com.solvd.service.repair;

public class Repair implements IDiagnose{
    @Override
    public void diagnoseProcess(int timeForDissambling, int timeForAssambling) {
        System.out.println("Time for diagnostics " + (timeForAssambling + timeForDissambling)/2 + " hours");
    }
}
