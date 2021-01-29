package com.company.design_pattern.singleton_pattern;

/*
    Singleton pattern is used to create only one instance of class in the whole of application.
    Two step:
    1. Make private constructor
    2. Implement getInstance method which return instance of object.
*/
public class PerformanceStage {
    private static int COUNTER;
    private static PerformanceStage INSTANCE = null;

    private PerformanceStage() {
        COUNTER++;
    }

    /*
        The synchronized keyword is used for thread safe.
    */
    public static synchronized PerformanceStage getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnTheLight() {
        System.out.println("Turn on the light!");
    }

    public int getCounter() {
        return COUNTER;
    }
}
