package com.company.design_pattern.observer_pattern.employee_system.department;

import com.company.design_pattern.observer_pattern.employee_system.department.observer.IDepartmentObserver;
import com.company.design_pattern.observer_pattern.employee_system.domain.Employee;

public class PayrollDepartment implements IDepartmentObserver {

    @Override
    public void callMe(Employee employee, String message) {
        System.out.println("PayrollDepartment notified...");
        System.out.println(message);
    }
}
