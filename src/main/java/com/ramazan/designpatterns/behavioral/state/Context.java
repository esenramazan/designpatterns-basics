package com.ramazan.designpatterns.behavioral.state;

// Context
class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
        if (state instanceof StateA) {
            setState(new StateB());
        }
    }
}

