package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * Default implementation of the {@link ExpensiveService} interface.
 *
 * <p>This class simulates a slow or computationally expensive operation by introducing
 * a delay before returning the result. It is commonly used to demonstrate the
 * effectiveness of decorators such as caching, which can significantly improve
 * performance when wrapping this implementation.</p>
 *
 * <p>The calculation performed is intentionally simple (multiplying the input by 10),
 * but the artificial delay mimics scenarios such as:</p>
 *
 * <ul>
 *   <li>Heavy CPU computations</li>
 *   <li>Slow I/O operations</li>
 *   <li>Database or external API calls</li>
 * </ul>
 */
public class ExpensiveServiceImpl implements ExpensiveService {

    /**
     * Simulates a slow calculation by introducing a 2-second delay,
     * then returns {@code input * 10}.
     *
     * @param input the value to be processed
     * @return the result of the simulated expensive computation
     */
    @Override
    public int calculate(int input) {
        try {
            Thread.sleep(2000); // Simulate heavy operation
        } catch (Exception ignored) {}

        return input * 10;
    }
}
