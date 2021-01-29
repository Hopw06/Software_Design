package StrategyPatten;

import StrategyPatten.SortAlgorithm.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.setItems(new ArrayList<>());
        sortedList.setStrategy(new QuickSort());
        sortedList.sort();
    }
}
