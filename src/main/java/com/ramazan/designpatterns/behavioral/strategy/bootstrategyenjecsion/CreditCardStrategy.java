package com.ramazan.designpatterns.behavioral.strategy.bootstrategyenjecsion;

import org.springframework.stereotype.Service;

// Concrete strategies
@Service("CreditCard")
public class CreditCardStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
