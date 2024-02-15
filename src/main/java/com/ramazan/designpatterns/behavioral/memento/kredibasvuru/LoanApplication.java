package com.ramazan.designpatterns.behavioral.memento.kredibasvuru;

// Originator
class LoanApplication {
    private String name;
    private String address;
    private String employmentStatus;
    private double income;

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setEmploymentStatus(String employmentStatus) { this.employmentStatus = employmentStatus; }
    public void setIncome(double income) { this.income = income; }

    public ApplicationState save() {
        return new ApplicationState(name, address, employmentStatus, income);
    }

    public void restore(ApplicationState state) {
        this.name = state.getName();
        this.address = state.getAddress();
        this.employmentStatus = state.getEmploymentStatus();
        this.income = state.getIncome();
    }
}
