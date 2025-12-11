package com.myprojecticaro.poc_designe_patterns.structural.proxy;

/**
 * Common interface for both the real object and its proxy.
 */
public interface ExpensiveOperation {
    int execute(int value);
}
