package com.ramazan.designpatterns.structural.bridge.otherexample;

public class BankB extends Bank {
    public BankB(MoneyAccount moneyAccount) {
        super(moneyAccount);
    }

    @Override
    public String bankName() {
        return "Bank B - " + moneyAccount.accountType();
    }
}
