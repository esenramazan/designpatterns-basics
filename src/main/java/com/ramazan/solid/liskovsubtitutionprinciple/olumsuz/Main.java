package com.ramazan.solid.liskovsubtitutionprinciple.olumsuz;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(5);
        System.out.println("Area of square: " + square.getArea());
    }
}

