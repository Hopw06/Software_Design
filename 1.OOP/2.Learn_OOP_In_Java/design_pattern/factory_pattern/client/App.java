package com.company.design_pattern.factory_pattern.client;

import com.company.design_pattern.factory_pattern.vehicle.IVehicle;
import com.company.design_pattern.factory_pattern.vehicle_factory.VehicleFactory;
import com.company.design_pattern.factory_pattern.vehicle_factory.VehicleType;

public class App {

    public static void main(String[] args) {
        IVehicle vehicle = VehicleFactory.getVehicle(VehicleType.TRUNK);
        vehicle.startEngine();
    }
}
