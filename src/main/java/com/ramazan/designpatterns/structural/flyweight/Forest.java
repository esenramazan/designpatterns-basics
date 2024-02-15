package com.ramazan.designpatterns.structural.flyweight;

public class Forest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = TreeFactory.getTree("Pine");
            tree.display(i, i);
        }
    }
}
