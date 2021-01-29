package com.company.oop_design.object_message;

/*
    Methods defined in a class definition represent the behavior that instances of that
    class will have during runtime

    This behavior is invoked by sending messages to that Object
    Call method is like sending message to object.
*/

public class Vehicle {
    public void startEngine() {
        System.out.println("start Engine...");
    }

    public void stopEngine() {
        System.out.println("stop Engine...");
    }

    public void accelerate() {
        System.out.println("accelerating myself...");
    }
}
