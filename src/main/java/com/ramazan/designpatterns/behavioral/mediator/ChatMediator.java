package com.ramazan.designpatterns.behavioral.mediator;

// Mediator interface
public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
