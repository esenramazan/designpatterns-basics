package com.ramazan.designpatterns.behavioral.observer;

// Concrete Observer
class ConcreteObserver implements Observer {
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getState();
        System.out.println("State changed: " + observerState);
    }
}
