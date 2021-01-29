package com.company.design_pattern.factory_pattern.vehicle_factory;

import com.company.design_pattern.factory_pattern.vehicle.*;

public enum VehicleType {
    CAR {
        @Override
        IVehicle getVehicle() {
            return new Car();
        }
    },
    TRUNK {
        @Override
        IVehicle getVehicle() {
            return new Trunk();
        }
    },
    BUS {
        @Override
        IVehicle getVehicle() {
            return new Bus();
        }
    },
    ELECTRIC_CAR {
        @Override
        IVehicle getVehicle() {
            return new ElectricCar();
        }
    };

    abstract IVehicle getVehicle();
}
