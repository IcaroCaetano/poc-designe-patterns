package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * A concrete decorator that adds Slack notification capability
 * to an existing {@link Notifier} implementation.
 *
 * <p>This class extends {@link BaseDecorator} and enhances the behavior
 * of the wrapped notifier by sending a Slack message after the original
 * notification has been delivered.</p>
 *
 * <p>It is part of the Decorator Pattern, enabling flexible combination
 * of multiple notification channels (Email, SMS, Push, Slack, etc.)
 * without modifying existing classes.</p>
 */
public class SlackNotifier extends BaseDecorator {

    /**
     * Creates a new decorator that adds Slack notification support.
     *
     * @param wrapped the original {@link Notifier} being decorated
     */
    public SlackNotifier(Notifier wrapped) {
        super(wrapped);
    }

    /**
     * Sends the original notification using the wrapped notifier
     * and then additionally sends a Slack message.
     *
     * @param message the notification message to be delivered
     */
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SLACK MESSAGE: " + message);
    }
}
