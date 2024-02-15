package com.ramazan.designpatterns.creational.abstractFactoryPattern.newexample;

// Client code
public class Main {
    public static void main(String[] args) {
        MyObjectFactory factory1 = new MyObject1Factory();
        MyObject object1 = factory1.createMyObject();
        object1.doSomething();

        MyObjectFactory factory2 = new MyObject2Factory();
        MyObject object2 = factory2.createMyObject();
        object2.doSomething();
    }
}
