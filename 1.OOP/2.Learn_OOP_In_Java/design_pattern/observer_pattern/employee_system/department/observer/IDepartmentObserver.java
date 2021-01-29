package com.company.design_pattern.observer_pattern.employee_system.department.observer;

import com.company.design_pattern.observer_pattern.employee_system.domain.Employee;

/*
    Observer interface.
*/
public interface IDepartmentObserver {

    void callMe(Employee employee, String message);
}
