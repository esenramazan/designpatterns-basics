package com.ramazan.designpatterns.creational.abstractFactoryPattern;

// Abstract Factory
interface SentimentFactory {
    SentimentClient getClient(String clientName);
}
