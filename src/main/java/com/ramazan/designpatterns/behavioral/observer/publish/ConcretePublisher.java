package com.ramazan.designpatterns.behavioral.observer.publish;

// Concrete Subject
class ConcretePublisher extends Publisher {
    public void publish(String message) {
        notifySubscribers(message);
    }
}

