package com.myprojecticaro.poc_designe_patterns.behavioral.mediator;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;
    
    protected User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

}

