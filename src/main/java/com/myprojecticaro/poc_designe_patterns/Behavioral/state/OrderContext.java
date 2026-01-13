package com.myprojecticaro.poc_designe_patterns.behavioral.state;

public class OrderContext {

    private OrderState state;

    public OrderContext() {
        this.state = new CreatedState();
    }

    protected void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void previous() {
        state.previous(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}

