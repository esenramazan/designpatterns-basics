package com.ramazan.designpatterns.behavioral.chainOfResponsibility.atmOrn;

public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public void dispense(int amount) {
        this.c1.dispense(new Currency(amount));
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.dispense(385);
    }
}
