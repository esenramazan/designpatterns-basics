package com.ramazan.designpatterns.behavioral.strategy.bootstrategyenjecsion;

import org.springframework.stereotype.Service;

@Service()
public class RamazanStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println(amount + " paid with Ramazan.");
    }
}
