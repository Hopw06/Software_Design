package com.company.oop_design.open_closed_principle;

public class Doctor extends Employee{

    public Doctor(String name, String department, boolean working) {
        super(name, department, working);
        System.out.println("Doctor in action...");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }

    private void prescribeMedicine() {
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients() {
        System.out.println("Diagnosing Patient");
    }
}
