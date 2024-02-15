package com.ramazan.designpatterns.structural.decorator;

public class Peperoni extends ToppingDecorator{
    public Peperoni(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + "Peppereoni";
    }

    public double getCost() {

        return tempPizza.getCost() + 0.50;
    }
}
