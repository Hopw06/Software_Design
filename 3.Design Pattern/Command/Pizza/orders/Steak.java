package Command.Pizza.orders;

import Command.Pizza.Chef;

public class Steak implements Order{
    private Chef mChef;

    public Steak(Chef chef) {
        this.mChef = chef;
    }

    @Override
    public void execute() {
        this.mChef.makeSteak();
    }
}
