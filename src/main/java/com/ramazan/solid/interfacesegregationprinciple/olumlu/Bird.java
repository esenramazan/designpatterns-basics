package com.ramazan.solid.interfacesegregationprinciple.olumlu;

public class Bird implements Flyable, Runnable {
    public void run() { System.out.println("Koşan kuş"); }
    public void fly() { System.out.println("Uçan kuş"); }
}
