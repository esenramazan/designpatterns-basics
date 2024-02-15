package com.ramazan.designpatterns.creational.abstractFactoryPattern;

// Client code
public class Main {
    public static void main(String[] args) {
        SentimentFactory factory = new SentimentFactoryImpl();
        SentimentClient client = factory.getClient("FirstClient");
        client.analyze("Hello, world!");
    }
}
