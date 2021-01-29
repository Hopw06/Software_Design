package com.company.oop_design.dependency_inversion.process;

public class PhoneManufacturingProcess extends GeneralManufacturingProcess {

    public PhoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled phone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested phone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged phone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored phone");
    }
}
