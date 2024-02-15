package com.ramazan.designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        User userWithAccess = new User("Alice", true);
        User userWithoutAccess = new User("Bob", false);

        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process(userWithAccess);  // Output: Processing complete for user: Alice
        object.process(userWithoutAccess);  // Output: Access denied for user: Bob
    }

}
