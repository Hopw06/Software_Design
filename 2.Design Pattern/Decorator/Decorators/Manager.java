package Decorator.Decorators;

import Decorator.Employees.EmployeeComponent;

public class Manager extends EmployeeDecorator{

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirement.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning task.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
