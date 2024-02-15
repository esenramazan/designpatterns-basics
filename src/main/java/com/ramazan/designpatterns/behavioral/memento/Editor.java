package com.ramazan.designpatterns.behavioral.memento;

// Originator
class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }
}
