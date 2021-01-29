package com.company.design_pattern.observer_pattern.employee_system.domain.dao;

import com.company.design_pattern.observer_pattern.employee_system.domain.Employee;

import java.util.ArrayList;
import java.util.List;

/*
    DAO class, contain class to interact with database.
*/
public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", null, 5000, true);
    Employee emp2 = new Employee("Steve", null, 4500, true);
    Employee emp3 = new Employee("John", null, 7000, true);
    Employee emp4 = new Employee("Pat", null, 6000, true);
    Employee emp5 = new Employee("Joe", null, 8000, true);

    ArrayList<Employee> employees;

    public void generateEmployees() {
        employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
    }

    public Employee queryEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == id) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void changeEmployeeName(int id, String name) {
        employees.get(id).setName(name);
    }

    public void changeEmployeeSalary(int id, long salary) {
        employees.get(id).setSalary(salary);
    }

    public void changeEmployeeState(int id, boolean working) {
        employees.get(id).setWorking(working);
    }

    public void deleteEmployee(Employee emp) {
        employees.remove(emp);
    }
}
