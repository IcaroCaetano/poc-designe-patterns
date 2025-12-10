package com.myprojecticaro.poc_designe_patterns.Behavioral.command;

import com.myprojecticaro.poc_designe_patterns.structural.decorator.Notifier;

/**
 * A concrete Command that encapsulates a request to send a notification.
 */
public class SendNotificationCommand implements Command {

    private final Notifier notifier;
    private final String message;

    public SendNotificationCommand(Notifier notifier, String message) {
        this.notifier = notifier;
        this.message = message;
    }

    @Override
    public void execute() {
        notifier.send(message);
    }
}

