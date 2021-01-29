package com.company.oop_design.interface_segregation.transaction;

import com.company.oop_design.interface_segregation.model.Customer;
import com.company.oop_design.interface_segregation.model.Product;

import java.util.Date;
import java.util.List;

/*
    This principle state that no client should be forced to depend on code that they do not use.
    Such as here:
        AccountsReceivable only use prepareInvoice, chargeCustomer methods.
        => So it should only accept an Accounting instance to perform these methods
        ReportGenerator only use getName, getDate, productBreakDown methods.
        => So it should only accept a Reporting instance to perform these methods.

    A fat class which has many responsibilities
    Use interface to separate behavior is a good idea.
*/
public class CustomerTransaction implements Accounting, Reporting {

    private Customer mCustomer;
    private List<Product> mProducts;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.mCustomer = customer;
        this.mProducts = products;
    }

    // methods for reporting
    public String getName() {
        return mCustomer.getName();
    }

    public Date getDate() {
        return new Date();
    }

    public String productBreakDown() {
        String productsReporting = "";
        for (Product product : mProducts) {
            productsReporting += product.getProductId() + " " + product.getProductName() + "\n";
        }
        return productsReporting;
    }

    // methods for accounting
    public void prepareInvoice() {
        System.out.println("prepare invoice");
    }

    public void chargeCustomer() {
        System.out.println("change customer");
    }
}
