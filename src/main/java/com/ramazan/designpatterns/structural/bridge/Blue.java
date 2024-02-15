package com.ramazan.designpatterns.structural.bridge;

// Color arayüzünü uygulayan Blue sınıfı
public class Blue implements Color {
    @Override
    public String fill() {
        return "Color is Blue";
    }
}