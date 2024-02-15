package com.ramazan.designpatterns.behavioral.state.kodtemizligi;

class NewState implements UserState {
    public void promote(User user) {
        user.setState(new ActiveState());
        System.out.println("User is now active.");
    }
}
