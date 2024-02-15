package com.ramazan.designpatterns.behavioral.command.islemerteleme;

import java.util.LinkedList;
import java.util.Queue;

// Invoker Class
class CommandQueue {
    private Queue<Command> queue = new LinkedList<>();

    public void addCommand(Command command) {
        queue.add(command);
    }

    public void executeCommands() {
        while (!queue.isEmpty()) {
            Command command = queue.poll();
            command.execute();
        }
    }
}

