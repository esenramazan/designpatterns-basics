package com.ramazan.designpatterns.behavioral.state.kodtemizligi;

class InactiveState implements UserState {
    public void promote(User user) {
        user.setState(new NewState());
        System.out.println("User is now new again.");
    }
}
