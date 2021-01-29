package com.company.design_pattern.observer_pattern.coffee_shop.attendent;

import com.company.design_pattern.observer_pattern.coffee_shop.customer.WaitingCustomer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {

    private List<WaitingCustomer> mCustomers;
    private String mCompletedDrink;

    public CoffeeAttendent() {
        mCustomers = new ArrayList<>();
    }

    public void takeOrder(WaitingCustomer customer) {
        mCustomers.add(customer);
    }

    public void prepareDrink(String drinkToPrepare) {
        System.out.println("Prepare drink for customer");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.mCompletedDrink = drinkToPrepare;
        System.out.println("Done, Drink: " + this.mCompletedDrink);
        callOutCompletedOrder();
    }

    public void callOutCompletedOrder() {
        for (WaitingCustomer customer : mCustomers) {
            if (customer.getDrinkOrdered().equals(this.mCompletedDrink)) {
                System.out.println("Customer " + customer.getName() + ", please go to the counter.");
                customer.orderReady(this.mCompletedDrink);
                mCustomers.remove(customer);
                break;
            }
        }
    }
}
