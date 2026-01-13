package com.myprojecticaro.poc_designe_patterns.behavioral.state;

public class ShippedState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order already shipped");
    }

    @Override
    public void previous(OrderContext context) {
        context.setState(new PaidState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order shipped");
    }
}

