package com.company.design_pattern.factory_pattern.vehicle;

public class ElectricCar implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Start Electric Car's engine!");
    }
}
