package com.company.oop_design.dependency_inversion.client;

import com.company.oop_design.dependency_inversion.process.GeneralManufacturingProcess;
import com.company.oop_design.dependency_inversion.process.PhoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess phone = new PhoneManufacturingProcess("Samsung Galaxy S20 process");
        phone.launchProcess();
    }
}
