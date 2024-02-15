package com.ramazan.designpatterns.behavioral.visitor.apituketim;

class UserApiElement implements ApiElement {
    private String endpoint = "/users";

    public String getEndpoint() {
        return endpoint;
    }

    @Override
    public void accept(ApiVisitor visitor) {
        visitor.visit(this);
    }
}
