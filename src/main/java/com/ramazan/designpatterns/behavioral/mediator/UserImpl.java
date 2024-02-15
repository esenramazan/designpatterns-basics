package com.ramazan.designpatterns.behavioral.mediator;

// Concrete User classes
public class UserImpl extends User {
    public UserImpl(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }
    public void send(String msg){
        mediator.sendMessage(msg, this);
    }
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }
}
