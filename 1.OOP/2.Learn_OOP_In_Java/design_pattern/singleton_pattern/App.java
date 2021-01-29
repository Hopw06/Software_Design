package com.company.design_pattern.singleton_pattern;

public class App {
    public static void main(String[] args) {
        PerformanceStage stage = PerformanceStage.getInstance();
        stage.turnOnTheLight();
        System.out.println(stage.getCounter());

        PerformanceStage stage1 = PerformanceStage.getInstance();
        System.out.println(stage.getCounter());

        PerformanceStage stage2 = PerformanceStage.getInstance();
        System.out.println(stage.getCounter());

        PerformanceStage stage3 = PerformanceStage.getInstance();
        System.out.println(stage.getCounter());
        // COUNTER is static.
    }
}
