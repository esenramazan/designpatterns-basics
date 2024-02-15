package com.ramazan.designpatterns.structural.decorator;

public class PizzaMaker {
    public static void main(String[] args){
        Pizza basicPizza = new Peperoni(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}
