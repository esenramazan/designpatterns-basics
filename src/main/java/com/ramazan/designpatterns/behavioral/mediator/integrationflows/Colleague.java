package com.ramazan.designpatterns.behavioral.mediator.integrationflows;

public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    // Send a message via the mediator
    public void send(String message) {
        mediator.send(message, this);
    }

    // Get access to the mediator
    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}
