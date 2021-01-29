package com.company.oop_design.open_closed_principle;

abstract public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(String name, String department, boolean working) {
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    abstract public void performDuties();
}
