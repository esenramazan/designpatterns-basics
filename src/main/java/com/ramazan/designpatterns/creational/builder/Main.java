package com.ramazan.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .dough("cross")
                .sauce("mild")
                .topping("ham and pineapple")
                .build();

        System.out.println(pizza.toString());
    }
}
