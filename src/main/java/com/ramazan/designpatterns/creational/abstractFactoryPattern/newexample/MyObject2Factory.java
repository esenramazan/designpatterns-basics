package com.ramazan.designpatterns.creational.abstractFactoryPattern.newexample;

// Concrete Factory 2
class MyObject2Factory implements MyObjectFactory {
    @Override
    public MyObject createMyObject() {
        return new MyObject2();
    }
}

