package Singleton;

class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton INSTANCE;
    private double a;

    private ThreadSafeLazySingleton () {
        a = Math.random();
    }

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ThreadSafeLazySingleton();
        }
        return INSTANCE;
    }

    public double getValue() {
        return a;
    }
}