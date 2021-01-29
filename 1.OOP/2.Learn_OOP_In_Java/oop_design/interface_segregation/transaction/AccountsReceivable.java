package com.company.oop_design.interface_segregation.transaction;

public class AccountsReceivable {

    private CustomerTransaction transactionObject;

    public AccountsReceivable(CustomerTransaction transaction) {
        this.transactionObject = transaction;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
        // sends the invoice
    }
}
