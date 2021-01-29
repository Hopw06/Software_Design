package Command.Pizza.orders;

import Command.Pizza.Chef;

public class Pizza implements Order{

    private Chef mChef;

    public Pizza(Chef chef) {
        this.mChef = chef;
    }

    @Override
    public void execute() {
        this.mChef.makePizza();
    }
}
