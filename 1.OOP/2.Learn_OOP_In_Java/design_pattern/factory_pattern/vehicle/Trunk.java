package com.company.design_pattern.factory_pattern.vehicle;

public class Trunk implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Start Trunk's engine!");
    }
}
