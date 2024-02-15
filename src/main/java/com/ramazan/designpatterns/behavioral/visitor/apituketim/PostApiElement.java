package com.ramazan.designpatterns.behavioral.visitor.apituketim;

class PostApiElement implements ApiElement {
    private String endpoint = "/posts";

    public String getEndpoint() {
        return endpoint;
    }

    @Override
    public void accept(ApiVisitor visitor) {
        visitor.visit(this);
    }
}
