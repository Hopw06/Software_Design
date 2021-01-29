package Command.Pizza;

import Command.Pizza.orders.Order;

public class Waiter {

    public void takeOrder(Order order) {
        order.execute();
    }
}
