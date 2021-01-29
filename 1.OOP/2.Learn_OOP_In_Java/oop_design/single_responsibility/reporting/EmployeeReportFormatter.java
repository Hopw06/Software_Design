package com.company.oop_design.single_responsibility.reporting;

import com.company.oop_design.single_responsibility.model.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Employee anEmp, FormatType formatType) {
        super(anEmp, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
