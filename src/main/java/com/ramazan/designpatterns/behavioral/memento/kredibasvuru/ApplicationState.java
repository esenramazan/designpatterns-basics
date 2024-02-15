package com.ramazan.designpatterns.behavioral.memento.kredibasvuru;

// Memento
class ApplicationState {
    private String name;
    private String address;
    private String employmentStatus;
    private double income;

    public ApplicationState(String name, String address, String employmentStatus, double income) {
        this.name = name;
        this.address = address;
        this.employmentStatus = employmentStatus;
        this.income = income;
    }

    // Getter methods
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getEmploymentStatus() { return employmentStatus; }
    public double getIncome() { return income; }
}
