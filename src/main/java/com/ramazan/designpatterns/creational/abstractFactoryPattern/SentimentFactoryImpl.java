package com.ramazan.designpatterns.creational.abstractFactoryPattern;

// Concrete Factory
class SentimentFactoryImpl implements SentimentFactory {
    @Override
    public SentimentClient getClient(String clientName) {
        if (clientName.equals("FirstClient")) {
            return new FirstClient();
        } else if (clientName.equals("SecondClient")) {
            return new SecondClient();
        }
        return null;
    }
}
