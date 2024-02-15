package com.ramazan.designpatterns.behavioral.interpreter;

class Minus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Minus(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }
}

