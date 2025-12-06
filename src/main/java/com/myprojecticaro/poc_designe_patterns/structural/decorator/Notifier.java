package com.myprojecticaro.poc_designe_patterns.structural.decorator;

/**
 * Concrete implementation of the {@link Notifier} interface that simulates
 * sending notifications via email.
 *
 * <p>This class represents the base component in the Decorator Pattern.
 * Additional behaviors such as SMS, Slack, Push notifications, or caching
 * can be added dynamically by wrapping this notifier with decorator classes.</p>
 *
 * <p>The implementation simply prints a message to the console to simulate
 * sending an email.</p>
 */
public class EmailNotifier implements Notifier {

    /**
     * Sends a notification message via email.
     *
     * @param message the notification message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
