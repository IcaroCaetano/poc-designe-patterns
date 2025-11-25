package com.myprojecticaro.poc_designe_patterns.structural.decorator;

public abstract class BaseDecorator implements Notifier {

    protected final Notifier wrapped;

    protected BaseDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}
