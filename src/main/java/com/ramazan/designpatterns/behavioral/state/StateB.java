package com.ramazan.designpatterns.behavioral.state;

class StateB implements State {
    public void handleRequest() {
        System.out.println("Handling request and staying in State B");
    }
}

