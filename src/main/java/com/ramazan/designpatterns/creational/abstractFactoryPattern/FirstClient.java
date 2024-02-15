package com.ramazan.designpatterns.creational.abstractFactoryPattern;

// Concrete Factory 1
class FirstClient implements SentimentClient {
    @Override
    public void analyze(String text) {
        System.out.println("Analyzing sentiment with FirstClient: " + text);
    }
}