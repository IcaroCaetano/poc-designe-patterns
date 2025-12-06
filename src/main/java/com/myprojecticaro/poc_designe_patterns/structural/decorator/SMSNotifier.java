package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * A concrete decorator that adds SMS notification capability
 * to an existing {@link Notifier} implementation.
 *
 * <p>This class extends {@link BaseDecorator} and enhances the behavior
 * of the wrapped notifier by sending an SMS message after the original
 * notification is delivered.</p>
 *
 * <p>It is used as part of the Decorator Pattern, allowing multiple
 * notification channels (Email, Slack, Push, SMS, etc.) to be composed
 * flexibly without altering existing code.</p>
 */
public class SMSNotifier extends BaseDecorator {

    /**
     * Creates a new decorator that adds SMS notification support.
     *
     * @param wrapped the original {@link Notifier} being decorated
     */
    public SMSNotifier(Notifier wrapped) {
        super(wrapped);
    }

    /**
     * Sends the notification using the wrapped notifier and then
     * additionally sends an SMS message.
     *
     * @param message the notification message to be delivered
     */
    @Override
    public void send(String message) {
        super.send(message);  // Delegate to the wrapped notifier
        System.out.println("Sending SMS: " + message);
    }
}
