package Singleton;

class BillPughSingleton {
    private double a;

    private BillPughSingleton() {
        a = Math.random();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.Instance;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton Instance  = new BillPughSingleton();
    }

    public double getValue() {
        return a;
    }
}