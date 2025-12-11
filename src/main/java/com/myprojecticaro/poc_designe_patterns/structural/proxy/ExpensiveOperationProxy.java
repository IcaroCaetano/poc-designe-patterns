
package com.myprojecticaro.poc_designe_patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Proxy that controls access to the real ExpensiveOperation.
 * Adds caching and logging without modifying the real implementation.
 */
public class ExpensiveOperationProxy implements ExpensiveOperation {

    private final ExpensiveOperation realOperation = new ExpensiveOperationImpl();
    private final Map<Integer, Integer> cache = new HashMap<>();

    @Override
    public int execute(int value) {
        System.out.println("[Proxy] Request received for value: " + value);

        if (cache.containsKey(value)) {
            System.out.println("[Proxy] Returning cached result...");
            return cache.get(value);
        }

        System.out.println("[Proxy] Calling real operation...");
        int result = realOperation.execute(value);

        cache.put(value, result);
        return result;
    }
}
