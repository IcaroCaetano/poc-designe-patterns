package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * Represents a service that performs a computationally expensive or
 * resource-intensive calculation.
 *
 * <p>This interface is typically used as the base component in the
 * Decorator Pattern, where additional behaviors such as caching,
 * logging, or validation can be dynamically added by wrapping
 * implementations of this service.</p>
 *
 * <p>Implementations should provide the core logic for computing the
 * result based on the provided input.</p>
 */
public interface ExpensiveService {

    /**
     * Performs an expensive calculation using the given input value.
     *
     * @param input the integer input to process
     * @return the calculated result
     */
    int calculate(int input);
}
