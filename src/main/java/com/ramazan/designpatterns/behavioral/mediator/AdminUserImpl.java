package com.ramazan.designpatterns.behavioral.mediator;

public class AdminUserImpl extends User {
    public AdminUserImpl(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    @Override
    public void send(String msg){
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }
}
