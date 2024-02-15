package com.ramazan.designpatterns.behavioral.visitor.apituketim;

interface ApiElement {
    public void accept(ApiVisitor visitor);
}
