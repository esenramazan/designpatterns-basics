package com.ramazan.designpatterns.behavioral.template;

import java.util.HashMap;
import java.util.Map;

public class Computer {
    private Map<String, String> computerParts;

    public Computer(Map<String, String> computerParts){
        this.computerParts = computerParts;
    }

    public String getComputerParts() {
        return computerParts.toString();
    }
}

