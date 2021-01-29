package com.company.oop_design.open_closed_principle.exers.home_entertainment.devices;

public class SurroundSoundSystem implements DeviceFunction{
    @Override
    public void turnOn() {
        System.out.println("SurroundSoundSystem turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("SurroundSoundSystem turn off...");
    }
}
