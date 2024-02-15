package com.ramazan.designpatterns.structural.bridge.otherexample;

// Banka soyut sınıfı, MoneyAccount nesnesine bir referans (köprü) içerir
public abstract class Bank {
    protected MoneyAccount moneyAccount;

    public Bank(MoneyAccount moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    abstract public String bankName();
}