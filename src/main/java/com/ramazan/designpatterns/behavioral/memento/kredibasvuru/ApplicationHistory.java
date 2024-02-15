package com.ramazan.designpatterns.behavioral.memento.kredibasvuru;

import java.util.Stack;

// Caretaker
class ApplicationHistory {
    private Stack<ApplicationState> history = new Stack<>();

    public void push(ApplicationState state) {
        history.push(state);
    }

    public ApplicationState pop() {
        return history.pop();
    }
}

