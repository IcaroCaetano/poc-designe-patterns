package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * A concrete decorator that adds push notification functionality
 * to an existing {@link Notifier} implementation.
 *
 * <p>This class extends {@link BaseDecorator} and augments the behavior of the
 * wrapped notifier by sending a push notification after delegating the original
 * message to the wrapped component.</p>
 *
 * <p>Used as part of the Decorator Pattern to dynamically combine multiple
 * notification channels such as Email, SMS, Slack, and Push, without modifying
 * existing code.</p>
 */
public class PushNotifier extends BaseDecorator {

    /**
     * Creates a new decorator that adds push notification behavior.
     *
     * @param wrapped the original notifier being decorated
     */
    public PushNotifier(Notifier wrapped) {
        super(wrapped);
    }

    /**
     * Sends the notification using the wrapped notifier and then
     * additionally sends a push notification.
     *
     * @param message the notification message to deliver
     */
    @Override
    public void send(String message) {
        super.send(message);  // Delegate to the wrapped notifier
        System.out.println("Sending PUSH NOTIFICATION: " + message);
    }
}
