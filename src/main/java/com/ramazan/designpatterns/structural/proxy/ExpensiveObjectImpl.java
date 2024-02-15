package com.ramazan.designpatterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {
    @Override
    public void process(User user) {
        System.out.println("Processing complete for user: " + user.getName());
    }
}
