package com.myprojecticaro.poc_designe_patterns.structural.proxy;

/**
 * Concrete implementation of {@link ExpensiveOperation} that represents
 * a real and costly computation.
 *
 * <p>This class simulates a slow or resource-intensive process by adding
 * an artificial delay using {@link Thread#sleep(long)}. It is typically used
 * together with a Proxy implementation to demonstrate how expensive calls
 * can be optimized through caching, lazy loading, access control, or other
 * enhancements.</p>
 *
 * <p><strong>Behavior:</strong></p>
 * <ul>
 *     <li>Pauses execution for ~2 seconds to simulate heavy processing.</li>
 *     <li>Returns the computed value by multiplying the input by 10.</li>
 * </ul>
 *
 * <p>Example:</p>
 * <pre>{@code
 * ExpensiveOperation operation = new ExpensiveOperationImpl();
 * int result = operation.execute(5); // returns 50
 * }</pre>
 */
public class ExpensiveOperationImpl implements ExpensiveOperation {

    @Override
    public int execute(int value) {
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
        return value * 10;
    }
}

