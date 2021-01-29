package com.company.design_pattern.observer_pattern.coffee_shop.customer;

public interface WaitingCustomer {
    String getName();
    String getDrinkOrdered();
    void orderReady(String preparedDrink);
}
