package com.ramazan.designpatterns.behavioral.command.undoexample;


// Concrete Command Classes
class InsertCommand implements Command {
    private Document document;
    private String text;

    public InsertCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.insert(text);
    }

    @Override
    public void undo() {
        document.delete(text);
    }
}
