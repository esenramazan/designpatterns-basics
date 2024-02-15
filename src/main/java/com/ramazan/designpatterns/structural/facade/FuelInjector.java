package com.ramazan.designpatterns.structural.facade;

public class FuelInjector {
    public void on() {
        System.out.println("Fuel Injector is on");
    }

    public void off() {
        System.out.println("Fuel Injector is off");
    }

    public void inject() {
        System.out.println("Fuel is being injected");
    }
}
