package com.ramazan.designpatterns.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);

        // Send requests to the chain
        h1.handleRequest(new Request("Negative Value ", -1));
        h1.handleRequest(new Request("NonNegative Value ",  0));
        h1.handleRequest(new Request("Positive Value ",  1));
    }
}
