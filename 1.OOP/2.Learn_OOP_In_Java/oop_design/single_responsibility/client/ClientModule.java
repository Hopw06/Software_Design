package com.company.oop_design.single_responsibility.client;

import com.company.oop_design.single_responsibility.model.dao.EmployeeDao;
import com.company.oop_design.single_responsibility.model.Employee;
import com.company.oop_design.single_responsibility.reporting.EmployeeReportFormatter;
import com.company.oop_design.single_responsibility.reporting.FormatType;

public class ClientModule
{
    public static void main(String[] args) {
        Employee me = new Employee("Phong", "App 4", false);
        hireNewEmployee(me);
        printEmployeeReport(me, FormatType.XML);
    }

    private static void hireNewEmployee(Employee emp) {
        new EmployeeDao().saveEmployee(emp);
        System.out.println("Hired new employee: " + emp);
    }

    private static void terminateEmployee(Employee emp) {
        new EmployeeDao().deleteEmployee(emp);
        System.out.println("Terminated an employee: " + emp);
    }

    private static void printEmployeeReport(Employee emp, FormatType formatType) {
        EmployeeReportFormatter reporter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(reporter.getFormattedEmployee());
    }
}