package com.ramazan.solid.interfacesegregationprinciple.olumsuz;

public class Cat implements Animal {
    public void fly() { /* do nothing */ }
    public void bark() { /* do nothing */ }
    public void run() { System.out.println("Koşan kedi"); }
}
