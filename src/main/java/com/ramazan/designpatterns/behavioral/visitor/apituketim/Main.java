package com.ramazan.designpatterns.behavioral.visitor.apituketim;

public class Main {
    public static void main(String[] args) {
        ApiElement[] elements = new ApiElement[]{new UserApiElement(), new PostApiElement()};
        ApiVisitor visitor = new ConcreteApiVisitor();
        for (ApiElement element : elements) {
            element.accept(visitor);
        }
    }
}
