package com.ramazan.designpatterns.behavioral.chainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue() >= 0) {
            System.out.println("Positive values are handled by ConcreteHandler2");
            System.out.println("ConcreteHandler2.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
