package com.company.oop_design.interface_segregation.client;

import com.company.oop_design.interface_segregation.model.Customer;
import com.company.oop_design.interface_segregation.model.Product;
import com.company.oop_design.interface_segregation.transaction.AccountsReceivable;
import com.company.oop_design.interface_segregation.transaction.CustomerTransaction;
import com.company.oop_design.interface_segregation.transaction.ReportGenerator;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer("Phong");
        Product proby = new Product(1, "Proby");
        Product fanta = new Product(2, "Fanta");
        Product fresh = new Product(3, "Fresh");
        List<Product> products = new ArrayList<Product>();
        products.add(proby);
        products.add(fanta);
        products.add(fresh);

        CustomerTransaction customerTransaction = new CustomerTransaction(customer, products);


        ReportGenerator mReporter = new ReportGenerator(customerTransaction);
        mReporter.generateReport();

        AccountsReceivable mAccountsReceivable = new AccountsReceivable(customerTransaction);
        mAccountsReceivable.postPayment();
        mAccountsReceivable.sendInvoice();
    }
}
