package com.company.oop_design.single_responsibility.reporting;

import com.company.oop_design.single_responsibility.model.ObjectReporter;

public class ReportFormatter {
    private String formattedValue;

    public ReportFormatter(ObjectReporter object, FormatType formatType) {
        switch (formatType) {
            case CSV:
                formattedValue = convertObjectToCSV(object);
                break;
            case XML:
                formattedValue = convertObjectToXML(object);
                break;
            default:
                formattedValue = "";
        }
    }

    private String convertObjectToXML(Object object) {

        return ((ObjectReporter) object).toXML();
    }

    private String convertObjectToCSV(Object object) {
        return ((ObjectReporter) object).toCSV();
    }

    protected String getFormattedValue() {
        return formattedValue;
    }
}
