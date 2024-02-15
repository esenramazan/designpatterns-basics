package com.ramazan.designpatterns.behavioral.command.undoexample;

import java.util.Stack;

// Invoker Class
class CommandManager {
    private Stack<Command> commandStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandStack.push(command);
    }

    public void undoCommand() {
        if (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
        }
    }
}
