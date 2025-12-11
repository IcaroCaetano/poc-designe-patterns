package com.myprojecticaro.poc_designe_patterns.structural.proxy;

/**
 * Represents a real, expensive computation.
 * This class simulates a slow process.
 */
public class ExpensiveOperationImpl implements ExpensiveOperation {

    @Override
    public int execute(int value) {
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
        return value * 10;
    }
}

