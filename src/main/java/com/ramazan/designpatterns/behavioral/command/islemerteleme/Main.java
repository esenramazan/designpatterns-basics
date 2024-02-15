package com.ramazan.designpatterns.behavioral.command.islemerteleme;

// Client Code
public class Main {
    public static void main(String[] args) {
        CommandQueue commandQueue = new CommandQueue();

        // Add commands to the queue
        commandQueue.addCommand(new PrintCommand("Hello, "));
        commandQueue.addCommand(new PrintCommand("World!"));

        // Execute commands at a later time
        commandQueue.executeCommands();  // Output: Hello, World!
    }
}
