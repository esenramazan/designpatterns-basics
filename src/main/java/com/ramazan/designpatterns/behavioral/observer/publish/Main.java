package com.ramazan.designpatterns.behavioral.observer.publish;

public class Main {
    public static void main(String[] args) {
        ConcretePublisher publisher = new ConcretePublisher();
        Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.publish("Hello, Subscribers!");
    }
}
