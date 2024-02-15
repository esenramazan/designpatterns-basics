package com.ramazan.designpatterns.behavioral.command.undoexample;

// Client Code
public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        CommandManager commandManager = new CommandManager();

        commandManager.executeCommand(new InsertCommand(document, "Hello, "));
        commandManager.executeCommand(new InsertCommand(document, "World!"));

        System.out.println(document);  // Output: Hello, World!

        commandManager.undoCommand();
        System.out.println(document);  // Output: Hello,

        commandManager.undoCommand();
        System.out.println(document);  // Output:
    }
}
