package com.ramazan.designpatterns.behavioral.chainOfResponsibility;

public class Request {
    private int value;
    private String description;

    public Request(String description, int value) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
