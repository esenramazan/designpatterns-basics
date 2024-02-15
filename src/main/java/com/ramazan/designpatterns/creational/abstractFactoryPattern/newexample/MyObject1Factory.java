package com.ramazan.designpatterns.creational.abstractFactoryPattern.newexample;

// Concrete Factory 1
class MyObject1Factory implements MyObjectFactory {
    @Override
    public MyObject createMyObject() {
        return new MyObject1();
    }
}