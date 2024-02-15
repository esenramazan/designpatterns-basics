package com.ramazan.designpatterns.structural.decorator;

// ConcreteComponent
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
