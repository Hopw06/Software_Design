package com.company.design_pattern.factory_pattern.vehicle;

public class Bus implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Start Bus's engine!");
    }
}
