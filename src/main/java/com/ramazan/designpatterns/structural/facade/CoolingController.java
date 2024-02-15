package com.ramazan.designpatterns.structural.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int temperature) {
        System.out.println("Setting temperature upper limit to " + temperature);
    }

    public void run() {
        System.out.println("Cooling Controller is running");
    }

    public void cool(int temperature) {
        System.out.println("Cooling to " + temperature);
    }

    public void stop() {
        System.out.println("Cooling Controller is stopping");
    }
}

