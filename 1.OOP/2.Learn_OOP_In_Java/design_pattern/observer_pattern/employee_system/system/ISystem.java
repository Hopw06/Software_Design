package com.company.design_pattern.observer_pattern.employee_system.system;

import com.company.design_pattern.observer_pattern.employee_system.department.observer.IDepartmentObserver;

/*
    Extract observer function to interface.
    Maybe other system want to implement those methods.
*/
public interface ISystem {

    void registerObserver(IDepartmentObserver observer);
    void unregisterObserver(IDepartmentObserver observer);
    void unregisterAll();
    void notifyObservers();


}
