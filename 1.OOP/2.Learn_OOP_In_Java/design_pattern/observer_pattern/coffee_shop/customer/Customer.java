package com.company.design_pattern.observer_pattern.coffee_shop.customer;

public class Customer implements WaitingCustomer{
    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setDrinkOrdered(String drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }

    @Override
    public void orderReady(String preparedDrink) {
        if (drinkOrdered.equals(preparedDrink)) {
            leaveShop();
        }
    }

    private void leaveShop() {
        System.out.println("___________________________________________________");
        System.out.println("I am " + getName() + " who ordered the drink");
        System.out.println("Thank you for preparing, I got it");
        System.out.println("I am leave the shop now");
        System.out.println("___________________________________________________");
    }
}
