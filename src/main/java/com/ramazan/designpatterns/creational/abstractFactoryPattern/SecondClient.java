package com.ramazan.designpatterns.creational.abstractFactoryPattern;

// Concrete Factory 2
class SecondClient implements SentimentClient {
    @Override
    public void analyze(String text) {
        System.out.println("Analyzing sentiment with SecondClient: " + text);
    }
}
