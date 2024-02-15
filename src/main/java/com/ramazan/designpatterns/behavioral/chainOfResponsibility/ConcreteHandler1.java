package com.ramazan.designpatterns.behavioral.chainOfResponsibility;

public class ConcreteHandler1 extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue() < 0) {
            System.out.println("Negative values are handled by ConcreteHandler1");
            System.out.println("ConcreteHandler1.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
