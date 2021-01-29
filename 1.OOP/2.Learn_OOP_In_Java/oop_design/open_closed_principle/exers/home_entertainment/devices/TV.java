package com.company.oop_design.open_closed_principle.exers.home_entertainment.devices;

public class TV implements DeviceFunction{
    @Override
    public void turnOn() {
        System.out.println("TV turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turn off...");
    }
}
