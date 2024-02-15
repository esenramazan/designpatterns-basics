package com.ramazan.solid.interfacesegregationprinciple.olumsuz;

public class Bird implements Animal {
    public void bark() { /* do nothing */ }
    public void run() { System.out.println("Koşan kuş"); }
    public void fly() { System.out.println("Uçan kuş"); }
}
