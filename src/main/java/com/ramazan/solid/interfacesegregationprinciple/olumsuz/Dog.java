package com.ramazan.solid.interfacesegregationprinciple.olumsuz;

public class Dog implements Animal {
    public void fly() { /* do nothing */ }
    public void bark() { System.out.println("Havlayan köpek"); }
    public void run() { System.out.println("Koşan köpek"); }
}
