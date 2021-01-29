package com.company.design_pattern.observer_pattern.coffee_shop.client;

import com.company.design_pattern.observer_pattern.coffee_shop.attendent.CoffeeAttendent;
import com.company.design_pattern.observer_pattern.coffee_shop.customer.Customer;

public class App {
    public static void main(String[] args) {
        CoffeeAttendent attendent = new CoffeeAttendent();
        attendent.takeOrder(new Customer("Phong", "Cappuchino"));
        attendent.takeOrder(new Customer("Me", "Tea milk"));

        attendent.prepareDrink("Cappuchino");
        attendent.prepareDrink("Tea milk");
    }
}
