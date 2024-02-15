package com.ramazan.designpatterns.behavioral.state.kodtemizligi;

class User {
    private UserState state = new NewState();

    public void setState(UserState state) {
        this.state = state;
    }

    public void promote() {
        state.promote(this);
    }
}
