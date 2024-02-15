package com.ramazan.designpatterns.behavioral.visitor;

interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
