package com.myprojecticaro.poc_designe_patterns.behavioral.state;

public class PaidState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new ShippedState());
    }

}

