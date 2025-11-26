package com.myprojecticaro.poc_designe_patterns.structural.decorator;

public class CacheDecorator implements ExpensiveService {

    private final ExpensiveService wrapped;
    private final Map<Integer, Integer> cache = new HashMap<>();

    public CacheDecorator(ExpensiveService wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public int calculate(int input) {
        return cache.computeIfAbsent(input, wrapped::calculate);
    }
}
