package Command.Pizza;

import Command.Pizza.orders.Pizza;
import Command.Pizza.orders.Steak;

public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Pizza pizza = new Pizza(chef);
        Steak steak = new Steak(chef);

        Waiter waiter = new Waiter();
        waiter.takeOrder(pizza);
        waiter.takeOrder(steak);
    }
}
