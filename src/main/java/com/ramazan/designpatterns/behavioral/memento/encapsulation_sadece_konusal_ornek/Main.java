package com.ramazan.designpatterns.behavioral.memento.encapsulation_sadece_konusal_ornek;

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setHiz(100);
        araba.setVites(3);
        System.out.println("Hız: " + araba.getHiz());
        System.out.println("Vites: " + araba.getVites());
    }
}
