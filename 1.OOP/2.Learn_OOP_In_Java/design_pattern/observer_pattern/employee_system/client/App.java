package com.company.design_pattern.observer_pattern.employee_system.client;

import com.company.design_pattern.observer_pattern.employee_system.department.HRDepartment;
import com.company.design_pattern.observer_pattern.employee_system.department.PayrollDepartment;
import com.company.design_pattern.observer_pattern.employee_system.domain.Employee;
import com.company.design_pattern.observer_pattern.employee_system.system.EmployeeManagementSystem;

import java.util.Date;

/*
    Client class to test function.
*/
public class App {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        HRDepartment hrDepartment = new HRDepartment();
        PayrollDepartment payrollDepartment = new PayrollDepartment();

        ems.registerObserver(hrDepartment);
        ems.registerObserver(payrollDepartment);

        Employee employee = new Employee("Me", new Date(), 1000, true);

        ems.hireNewEmployee(employee);

        ems.modifyEmployeeName(5, "Phong");

        ems.unregisterAll();
    }
}
