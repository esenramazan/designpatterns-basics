package com.ramazan.designpatterns.behavioral.chainOfResponsibility.atmOrn;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}
