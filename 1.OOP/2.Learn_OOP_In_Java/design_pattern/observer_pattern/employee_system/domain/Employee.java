package com.company.design_pattern.observer_pattern.employee_system.domain;

import com.company.design_pattern.observer_pattern.employee_system.department.observer.IDepartmentObserver;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String name;
    private Date hireDate;
    private long salary;
    public long employeeID;
    private boolean working = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, long salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;

        this.employeeID = ++COUNTER;
    }

    @Override
    public String toString() {
        return "Employee [name = " + name + ", hiredDate = " + hireDate
                + ", salary = " + salary + ", employeeID = " + employeeID + ", isWorking = " + working + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
