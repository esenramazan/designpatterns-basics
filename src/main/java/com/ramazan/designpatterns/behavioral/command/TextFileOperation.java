package com.ramazan.designpatterns.behavioral.command;

// Command Interface
@FunctionalInterface
public interface TextFileOperation {
    String execute();
}