package com.ramazan.designpatterns.behavioral.state;

// Concrete states
class StateA implements State {
    public void handleRequest() {
        System.out.println("Handling request and changing to State B");
    }
}
