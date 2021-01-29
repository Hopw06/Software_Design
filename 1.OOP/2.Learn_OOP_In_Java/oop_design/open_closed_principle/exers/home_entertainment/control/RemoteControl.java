package com.company.oop_design.open_closed_principle.exers.home_entertainment.control;

import com.company.oop_design.open_closed_principle.exers.home_entertainment.devices.DeviceFunction;

public class RemoteControl {
    private DeviceFunction mDevice = null;
    private static final RemoteControl mControl = new RemoteControl();

    public static RemoteControl getInstance() {
        return mControl;
    }

    public void selectDevice(DeviceFunction device) {
        mDevice = device;
    }

    public void turnOnDevice() {
        mDevice.turnOn();
    }

    public void turnOffDevice() {
        mDevice.turnOff();
    }
}
