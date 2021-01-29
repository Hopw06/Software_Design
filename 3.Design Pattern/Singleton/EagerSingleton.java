package Singleton;

import java.lang.Math;

class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private double a;

    private EagerSingleton () {
        a = Math.random();
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public double getValue() {
        return a;
    }
}
