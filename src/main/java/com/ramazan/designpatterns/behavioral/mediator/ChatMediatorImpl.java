package com.ramazan.designpatterns.behavioral.mediator;

import java.util.List;

// Concrete Mediator
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;
    // constructor, getters and setters


    public ChatMediatorImpl(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void sendMessage(String msg, User user) {
        for (User u : this.users){
            // message should not be received by the user sending it
            if (u != user){
                u.receive(msg);
            }
        }
    }
    public void addUser(User user){
        this.users.add(user);
    }
}
