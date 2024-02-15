package com.ramazan.designpatterns.behavioral.visitor.apituketim;

interface ApiVisitor {
    void visit(UserApiElement userApiElement);
    void visit(PostApiElement postApiElement);
}
