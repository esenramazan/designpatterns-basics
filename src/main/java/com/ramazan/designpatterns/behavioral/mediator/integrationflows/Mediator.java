package com.ramazan.designpatterns.behavioral.mediator.integrationflows;

public interface Mediator {
    void send(String message, Colleague colleague);
}
