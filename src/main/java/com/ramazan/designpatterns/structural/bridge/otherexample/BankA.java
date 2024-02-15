package com.ramazan.designpatterns.structural.bridge.otherexample;

// Banka arayüzünün somut sınıfları, MoneyAccount arayüzünden bir metodu kullanır
public class BankA extends Bank {
    public BankA(MoneyAccount moneyAccount) {
        super(moneyAccount);
    }

    @Override
    public String bankName() {
        return "Bank A - " + moneyAccount.accountType();
    }
}
