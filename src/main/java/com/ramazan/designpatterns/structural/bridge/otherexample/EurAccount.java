package com.ramazan.designpatterns.structural.bridge.otherexample;

public class EurAccount implements MoneyAccount {
    @Override
    public String accountType() {
        return "Account Type: EUR";
    }
}
