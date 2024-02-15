package com.ramazan.designpatterns.behavioral.strategy.bootstrategyenjecsion;

import org.springframework.stereotype.Service;

@Service("Paypal")
public class PaypalStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal.");
    }
}
