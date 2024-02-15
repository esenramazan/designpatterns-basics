package com.ramazan.designpatterns.structural.proxy;


public class User {
    private String name;
    private boolean hasAccess;

    public User() {
    }

    public User(String name, boolean hasAccess) {
        this.name = name;
        this.hasAccess = hasAccess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasAccess() {
        return hasAccess;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }
}

