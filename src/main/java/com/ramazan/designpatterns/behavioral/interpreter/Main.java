package com.ramazan.designpatterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "7 3 - 2 +";
        Parser parser = new Parser();
        System.out.println("'7 3 - 2 +' ifadesinin sonucu: " + parser.evaluate(expression));
    }
}
