package com.ramazan.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// Invoker Class
public class TextFileOperationExecutor {
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
