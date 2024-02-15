package com.ramazan.designpatterns.structural.flyweight;

public class PineTree implements Tree {
    private String type;

    public PineTree() {
        this.type = "Pine Tree";
        // Loading a pine tree's texture is a heavy operation
        // We simulate this heavy operation with a sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying a " + type + " at (" + x + "," + y + ")");
    }
}

