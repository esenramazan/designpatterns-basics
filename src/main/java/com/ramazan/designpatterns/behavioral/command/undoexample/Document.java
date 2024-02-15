package com.ramazan.designpatterns.behavioral.command.undoexample;

// Receiver Class
class Document {
    private StringBuilder text = new StringBuilder();

    public void insert(String text) {
        this.text.append(text);
    }

    public void delete(String text) {
        int index = this.text.lastIndexOf(text);
        if (index != -1) {
            this.text.delete(index, index + text.length());
        }
    }

    @Override
    public String toString() {
        return text.toString();
    }
}
