package com.ramazan.designpatterns.structural.bridge;

public class Main {

    public static void main (String[] args) {
        /*
        * Bu örnekte, Square sınıfı bir Shape’dir ve bir Color nesnesi ile çizilirSquare sınıfı, Color nesnesinin fill metodunu kullanarak çizilir
        * */
        Shape square = new Square(new Blue());
        System.out.println(square.draw());  // Çıktı: "Square drawn. Color is Blue"
    }
}
