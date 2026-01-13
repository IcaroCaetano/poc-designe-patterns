package com.myprojecticaro.poc_designe_patterns.behavioral.state;

public class CreatedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new PaidState());
    }

    @Override
    public void previous(OrderContext context) {
        System.out.println("Order is already in initial state");
    }
}

