package com.ramazan.designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();

        System.out.println("Starting the car engine...");
        facade.startEngine();
        System.out.println("Car engine started successfully!");

        // Simulate some driving time
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping the car engine...");
        facade.stopEngine();
        System.out.println("Car engine stopped successfully!");
    }
}
