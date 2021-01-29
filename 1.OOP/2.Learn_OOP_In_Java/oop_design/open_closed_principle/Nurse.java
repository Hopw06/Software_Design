package com.company.oop_design.open_closed_principle;

public class Nurse extends Employee{

    public Nurse(String name, String department, boolean working) {
        super(name, department, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatienArea();
    }

    private void checkVitalSigns() {
        System.out.println("Checking vitals");
    }

    private void drawBlood() {
        System.out.println("drawing blood");
    }

    private void cleanPatienArea() {
        System.out.println("cleaning patient area");
    }
}
