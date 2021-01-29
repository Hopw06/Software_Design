package com.company.oop_design.interface_segregation.transaction;

public class ReportGenerator {

    private Reporting transactionObject;

    public ReportGenerator(Reporting reporting) {
        this.transactionObject = reporting;
    }

    public void generateReport() {
        System.out.println(transactionObject.getName() +  "\n" + transactionObject.productBreakDown() + "\n" + transactionObject.getDate());
    }
}
