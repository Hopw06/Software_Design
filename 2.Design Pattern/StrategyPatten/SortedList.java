package StrategyPatten;

import java.util.List;

public class SortedList {
    private SortStrategy<String> mStrategy;
    private List<String> items;

    public void setStrategy(SortStrategy<String> mStrategy) {
        this.mStrategy = mStrategy;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void sort() {
        if (mStrategy != null) {
            mStrategy.sort(items);
        }
    }
}
