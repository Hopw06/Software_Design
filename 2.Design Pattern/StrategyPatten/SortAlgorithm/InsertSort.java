package StrategyPatten.SortAlgorithm;

import StrategyPatten.SortStrategy;

import java.util.List;

public class InsertSort implements SortStrategy<String> {
    @Override
    public void sort(List<String> items) {
        System.out.println("Insert Sort");
    }
}
