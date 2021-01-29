package Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
    }

    static class Counter implements Runnable {

        @Override
        public void run() {
            // TODO Auto-generated method stub
           //System.out.println(Thread.currentThread().getName() + " EagerSingleton : value "  + EagerSingleton.getInstance().getValue());
           // System.out.println(Thread.currentThread().getName() + " LazySingleton : value "  + LazySingleton.getInstance().getValue());
           //System.out.println(Thread.currentThread().getName() + " ThreadSafeLazySingleton : value "  + ThreadSafeLazySingleton.getInstance().getValue());
           //System.out.println(Thread.currentThread().getName() + " DoubleCheckLockingSingleton : value "  + DoubleCheckLockingSingleton.getInstance().getValue());

           System.out.println(Thread.currentThread().getName() + " BillPughSingleton : value "  + BillPughSingleton.getInstance().getValue());
        }

    }
}