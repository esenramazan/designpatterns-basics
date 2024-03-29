package com.ramazan.designpatterns.behavioral.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {
    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherboardSetupStatus = new ArrayList<>();

    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();
}

