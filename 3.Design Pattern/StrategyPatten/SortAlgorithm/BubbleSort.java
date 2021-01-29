package StrategyPatten.SortAlgorithm;

import StrategyPatten.SortStrategy;

import java.util.List;

public class BubbleSort implements SortStrategy<String> {
    @Override
    public void sort(List<String> items) {
        System.out.println("Bubble Sort");
    }
}
