package com.ramazan.designpatterns.behavioral.state.kodtemizligi;

class ActiveState implements UserState {
    public void promote(User user) {
        user.setState(new InactiveState());
        System.out.println("User is now inactive.");
    }
}
