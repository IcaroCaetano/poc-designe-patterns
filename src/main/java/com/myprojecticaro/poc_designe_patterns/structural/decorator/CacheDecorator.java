package com.myprojecticaro.poc_designe_patterns.structural.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * A concrete decorator that adds caching behavior to an {@link ExpensiveService}.
 *
 * <p>This class implements the Decorator Pattern by wrapping another
 * {@code ExpensiveService} and caching the results of expensive calculations.
 * When the same input is processed again, the cached value is returned instead of
 * invoking the underlying service, improving performance and reducing computation cost.</p>
 *
 * <p><b>Pattern Role:</b> Concrete Decorator in the Decorator design pattern.</p>
 */
public class CacheDecorator implements ExpensiveService {

    /**
     * The underlying service whose results will be cached.
     */
    private final ExpensiveService wrapped;

    /**
     * Internal cache storing previously computed values.
     * Maps input values to their corresponding results.
     */
    private final Map<Integer, Integer> cache = new HashMap<>();

    /**
     * Creates a caching decorator for the given service.
     *
     * @param wrapped the {@link ExpensiveService} whose calculations will be cached
     */
    public CacheDecorator(ExpensiveService wrapped) {
        this.wrapped = wrapped;
    }

    /**
     * Returns the cached result if available; otherwise computes the value using
     * the wrapped service and stores it in the cache.
     *
     * <p>The method uses {@link Map#computeIfAbsent(Object, java.util.function.Function)}
     * to simplify cache lookups and insertions.</p>
     *
     * @param input the value to be processed
     * @return the calculated or cached result
     */
    @Override
    public int calculate(int input) {
        return cache.computeIfAbsent(input, wrapped::calculate);
    }
}
