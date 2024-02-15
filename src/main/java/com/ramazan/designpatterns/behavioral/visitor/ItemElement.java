package com.ramazan.designpatterns.behavioral.visitor;

interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

