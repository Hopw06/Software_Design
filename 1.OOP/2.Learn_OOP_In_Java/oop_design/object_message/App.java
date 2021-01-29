package com.company.oop_design.object_message;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine(); // send message startEngine to vehicle object
        vehicle.accelerate(); // send message accelerate to vehicle object
        vehicle.stopEngine(); // send message stopEngine to vehicle object
    }
}
