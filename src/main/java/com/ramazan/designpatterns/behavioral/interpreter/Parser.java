package com.ramazan.designpatterns.behavioral.interpreter;

import java.util.Stack;

class Parser {
    private Stack<Expression> stack;

    public Parser() {
        this.stack = new Stack<>();
    }

    public int evaluate(String expression) {
        for (String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    Expression rightPlus = stack.pop();
                    Expression leftPlus = stack.pop();
                    Expression operatorPlus = new Plus(leftPlus, rightPlus);
                    int resultPlus = operatorPlus.interpret();
                    stack.push(new Number(resultPlus));
                    break;
                case "-":
                    Expression rightMinus = stack.pop();
                    Expression leftMinus = stack.pop();
                    Expression operatorMinus = new Minus(leftMinus, rightMinus);
                    int resultMinus = operatorMinus.interpret();
                    stack.push(new Number(resultMinus));
                    break;
                default:
                    stack.push(new Number(Integer.parseInt(token)));
                    break;
            }
        }
        return stack.pop().interpret();
    }
}
