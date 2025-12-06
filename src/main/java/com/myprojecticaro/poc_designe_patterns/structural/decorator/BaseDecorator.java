package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * Base class for all concrete decorators in the Decorator Pattern implementation.
 *
 * <p>This abstract class implements the {@link Notifier} interface and wraps another
 * {@code Notifier} instance, allowing additional behavior to be dynamically added
 * before or after delegating the operation.</p>
 *
 * <p>Concrete decorators should extend this class and override the
 * {@link #send(String)} method to append custom behavior while still calling
 * {@code super.send(message)} to preserve the original functionality.</p>
 *
 * <p><b>Pattern Role:</b> This class represents the <strong>Decorator</strong> in the 
 * classic Decorator design pattern.</p>
 */
public abstract class BaseDecorator implements Notifier {

    /**
     * The wrapped {@link Notifier} instance to which the request will be delegated.
     * Represents the component being decorated.
     */
    protected final Notifier wrapped;

    /**
     * Creates a new decorator wrapping the given notifier.
     *
     * @param wrapped the underlying {@link Notifier} to delegate behavior to
     */
    protected BaseDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
    }

    /**
     * Delegates the message sending operation to the wrapped notifier.
     * <p>
     * Concrete decorators may extend this behavior by overriding this method
     * and calling {@code super.send(message)} as part of the custom logic.
     * </p>
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}
