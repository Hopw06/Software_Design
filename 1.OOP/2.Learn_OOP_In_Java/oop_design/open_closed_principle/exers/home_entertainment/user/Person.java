package com.company.oop_design.open_closed_principle.exers.home_entertainment.user;

import com.company.oop_design.open_closed_principle.exers.home_entertainment.control.RemoteControl;
import com.company.oop_design.open_closed_principle.exers.home_entertainment.devices.Fan;
import com.company.oop_design.open_closed_principle.exers.home_entertainment.devices.Projector;
import com.company.oop_design.open_closed_principle.exers.home_entertainment.devices.TV;

public class Person {
    public static void main(String[] args) {
        TV tv = new TV();
        Fan fan = new Fan();
        Projector projector = new Projector();

        RemoteControl control = RemoteControl.getInstance();
        control.selectDevice(tv);
        control.turnOnDevice();
        control.turnOffDevice();

        control.selectDevice(fan);
        control.turnOnDevice();
        control.turnOffDevice();

        control.selectDevice(projector);
        control.turnOnDevice();
        control.turnOffDevice();
    }
}
