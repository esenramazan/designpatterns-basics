package com.ramazan.designpatterns.structural.bridge.otherexample;

public class UsdAccount implements MoneyAccount {
    @Override
    public String accountType() {
        return "Account Type: USD";
    }
}
