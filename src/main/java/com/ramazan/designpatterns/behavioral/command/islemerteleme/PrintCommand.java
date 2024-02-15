package com.ramazan.designpatterns.behavioral.command.islemerteleme;

// Concrete Command Classes
class PrintCommand implements Command {
    private String message;

    public PrintCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}

