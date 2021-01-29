package com.company.oop_design.open_closed_principle.exers.home_entertainment.devices;

public class Projector implements DeviceFunction{

    @Override
    public void turnOn() {
        System.out.println("Projector turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Projector turn off...");
    }
}
