package com.ramazan.designpatterns.structural.bridge;

// Shape soyut sınıfı, Color nesnesine bir referans (köprü) içerir
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}

