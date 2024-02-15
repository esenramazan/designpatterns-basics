package com.ramazan.designpatterns.behavioral.strategy.bootstrategyenjecsion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

// Context
@Service
public class ShoppingCartService {
    private final Map<String, PaymentStrategy> strategies;

    @Autowired
    public ShoppingCartService(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public void pay(String strategyOption, int amount) {
        strategies.get(strategyOption).pay(amount);
    }
}
