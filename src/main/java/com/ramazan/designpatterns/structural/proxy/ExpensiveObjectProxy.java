package com.ramazan.designpatterns.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private ExpensiveObject object = new ExpensiveObjectImpl();

    @Override
    public void process(User user) {
        if (user.isHasAccess()) {
            object.process(user);
        } else {
            System.out.println("Access denied for user: " + user.getName());
        }
    }
}
