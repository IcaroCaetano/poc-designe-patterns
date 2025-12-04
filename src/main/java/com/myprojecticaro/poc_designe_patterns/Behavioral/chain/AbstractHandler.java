package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

/**
 * Base abstract implementation of the {@link Handler} interface used in the
 * Chain of Responsibility pattern.
 * <p>
 * This class provides the foundational behavior for linking handlers together
 * and delegating requests down the chain. Concrete handlers should extend this
 * class and implement their own custom logic inside the {@link #handle(Request)}
 * method while optionally calling {@link #next(Request)} to continue the chain.
 * </p>
 *
 * <p>Example usage:</p>
 * <pre>
 *     Handler chain = new FirstHandler();
 *     chain.setNext(new SecondHandler())
 *          .setNext(new ThirdHandler());
 *
 *     chain.handle(request);
 * </pre>
 *
 * @author Icaro
 * @version 1.0
 */
public abstract class AbstractHandler implements Handler {

    /**
    * The next handler in the chain.
    */
    protected Handler next;

    /**
     * Sets the next handler that will be executed after this one.
     * This allows chaining handlers in a fluent manner.
     *
     * @param next the next {@link Handler} in the chain
     * @return the same handler instance passed as argument, enabling fluent linking
     */
    @Override
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    /**
     * Calls the next handler in the chain, if one exists.
     * <p>
     * Concrete handlers should call this method when they want the request
     * to continue being processed by the chain.
     * </p>
     *
     * @param request the {@link Request} object being processed
     */
    protected void next(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}

