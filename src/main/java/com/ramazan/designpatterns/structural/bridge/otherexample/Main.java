package com.ramazan.designpatterns.structural.bridge.otherexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();

        Bank bankA = new BankA(new UsdAccount());
        Bank bankB = new BankB(new EurAccount());

        banks.add(bankA);
        banks.add(bankB);


//        for(Bank b : banks) {
//            System.out.println(b.bankName());
//        }

        banks.forEach(b -> System.out.println(b.bankName()));
    }
}
