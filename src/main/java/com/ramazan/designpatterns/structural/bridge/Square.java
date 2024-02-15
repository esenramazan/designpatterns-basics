package com.ramazan.designpatterns.structural.bridge;

// Shape arayüzünün somut sınıfı, Color arayüzünden bir metodu kullanır
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
