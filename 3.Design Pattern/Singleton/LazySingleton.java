package Singleton;

import java.lang.Math;

class LazySingleton {

    private static LazySingleton INSTANCE;
    private double a;

    private LazySingleton () {
        a = Math.random();
    }

    public static LazySingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public double getValue() {
        return a;
    }
}
