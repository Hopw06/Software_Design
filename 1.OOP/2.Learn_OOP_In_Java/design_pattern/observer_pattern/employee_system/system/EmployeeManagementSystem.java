package com.company.design_pattern.observer_pattern.employee_system.system;

import com.company.design_pattern.observer_pattern.employee_system.department.observer.IDepartmentObserver;
import com.company.design_pattern.observer_pattern.employee_system.domain.Employee;
import com.company.design_pattern.observer_pattern.employee_system.domain.dao.EmployeeDAO;

import java.util.ArrayList;

public class EmployeeManagementSystem implements ISystem{

    private Employee employee; // message and employee are used to notify to clients.
    private String msg;

    private EmployeeDAO mEmployeeDAO;
    private ArrayList<IDepartmentObserver> mObservers;

    public EmployeeManagementSystem() {
        mObservers = new ArrayList<>();
        mEmployeeDAO = new EmployeeDAO();
        mEmployeeDAO.generateEmployees();
    }

    public void hireNewEmployee(Employee emp) {
        mEmployeeDAO.addEmployee(emp);
        this.employee = emp;
        this.msg = "New hired employee: ";
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String name) {
        Employee employee = mEmployeeDAO.queryEmployee(id);
        if (employee != null) {
            mEmployeeDAO.changeEmployeeName(id, name);
            this.employee = employee;
            this.msg = "Change name of employee to " + name;
            notifyObservers();
        }
    }


    @Override
    public void registerObserver(IDepartmentObserver observer) {
        mObservers.add(observer);
    }

    @Override
    public void unregisterObserver(IDepartmentObserver observer) {
        mObservers.remove(observer);
    }

    @Override
    public void unregisterAll() {
        mObservers.clear();
    }

    @Override
    public void notifyObservers() {
        for (IDepartmentObserver department : mObservers) {
            department.callMe(this.employee, this.msg);
        }
    }
}
