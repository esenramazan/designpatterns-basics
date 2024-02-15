package com.ramazan.designpatterns.creational.protype;

public class Main {
    public static void main(String[] args) {
        Sheep originalSheep = new Sheep("Dolly");
        Sheep clonedSheep = originalSheep.clone();

        clonedSheep.setName("Molly");

        System.out.println("Original sheep's name: " + originalSheep.getName());
        System.out.println("Cloned sheep's name: " + clonedSheep.getName());
    }
}