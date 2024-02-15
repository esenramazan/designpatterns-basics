package com.ramazan.designpatterns.behavioral.mediator;

// User abstract class (Colleague)
public abstract class User {
    protected ChatMediator mediator;
    protected String name;
    // constructor, getters and setters
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
