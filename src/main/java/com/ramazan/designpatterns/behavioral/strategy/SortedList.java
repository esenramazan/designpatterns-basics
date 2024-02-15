package com.ramazan.designpatterns.behavioral.strategy;

// Context
class SortedList {
    private SortingStrategy strategy;

    public SortedList(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] numbers) {
        strategy.sort(numbers);
    }
}

