package com.ramazan.solid.liskovsubtitutionprinciple.olumlu;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}