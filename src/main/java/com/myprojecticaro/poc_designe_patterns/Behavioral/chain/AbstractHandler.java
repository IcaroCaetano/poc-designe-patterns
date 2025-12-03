package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public abstract class AbstractHandler implements Handler {

    protected Handler next;

    @Override
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    protected void next(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}

