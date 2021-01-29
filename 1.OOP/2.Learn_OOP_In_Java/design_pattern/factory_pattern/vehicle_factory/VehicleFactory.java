package com.company.design_pattern.factory_pattern.vehicle_factory;

import com.company.design_pattern.factory_pattern.vehicle.IVehicle;

/*
    The main idea of Factory pattern is hide the logic of how to create an instance object.
    The client do not worry about the logic behind it.
 */
public class VehicleFactory {

    public static IVehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle(); // Remove the if/else or switch case statement
    }
}
