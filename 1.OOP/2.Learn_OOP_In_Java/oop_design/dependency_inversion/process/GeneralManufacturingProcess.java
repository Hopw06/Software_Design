package com.company.oop_design.dependency_inversion.process;

/*
    The concrete class should depend on the abstract class or interface because they do not change often.
    In general, this principle mean that code should only depend on things that don't change often.
 */
public abstract class GeneralManufacturingProcess {
    private String processName;

    public GeneralManufacturingProcess(String name) {
        this.processName = name;
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    // This called template method
    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {
            System.out.println(processName);
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("The process not found");
        }
    }
}
