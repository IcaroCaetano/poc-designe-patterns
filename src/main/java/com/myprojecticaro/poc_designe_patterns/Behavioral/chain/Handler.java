package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

/**
 * Represents a handler in the Chain of Responsibility pattern.
 * <p>
 * Each handler processes a request and optionally forwards it to
 * the next handler in the chain. This allows multiple processing
 * steps to be executed sequentially without tightly coupling them.
 * </p>
 *
 * <p>Typical usage:</p>
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
public interface Handler {

    /**
     * Sets the next handler in the chain.
     *
     * @param next the next {@link Handler} to be executed after this one
     * @return the same next handler instance, allowing chain-style linking
     */
    Handler setNext(Handler next);

    /**
     * Handles the incoming request. Implementations may optionally forward
     * the request to the next handler in the chain.
     *
     * @param request the {@link Request} object containing the data to be processed
     */
    void handle(Request request);
}

