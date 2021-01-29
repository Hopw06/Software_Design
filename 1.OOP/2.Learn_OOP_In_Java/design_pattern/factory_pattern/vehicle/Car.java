package com.company.design_pattern.factory_pattern.vehicle;

public class Car implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Start Car's engine!");
    }
}
