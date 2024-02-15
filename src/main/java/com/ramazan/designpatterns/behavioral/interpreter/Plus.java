package com.ramazan.designpatterns.behavioral.interpreter;

class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
