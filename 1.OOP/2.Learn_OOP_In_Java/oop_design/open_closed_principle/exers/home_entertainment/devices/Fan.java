package com.company.oop_design.open_closed_principle.exers.home_entertainment.devices;

public class Fan implements DeviceFunction {
    @Override
    public void turnOn() {
        System.out.println("Fan turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turn off...");
    }
}
