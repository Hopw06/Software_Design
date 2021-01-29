package Singleton;

import java.lang.Math;

class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;

    private double a;

    private DoubleCheckLockingSingleton() {
        a = Math.random();
    }

    public static DoubleCheckLockingSingleton getInstance() {
        DoubleCheckLockingSingleton result = instance;
        if (result == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = result =  new DoubleCheckLockingSingleton();
                }
            }
        }
        return result;
    }

    public double getValue() {
        return a;
    }
}