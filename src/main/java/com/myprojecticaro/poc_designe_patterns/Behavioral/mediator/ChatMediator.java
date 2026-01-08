package com.myprojecticaro.poc_designe_patterns.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

