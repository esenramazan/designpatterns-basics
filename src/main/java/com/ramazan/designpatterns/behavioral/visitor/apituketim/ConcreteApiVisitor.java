package com.ramazan.designpatterns.behavioral.visitor.apituketim;

import org.springframework.web.client.RestTemplate;

class ConcreteApiVisitor implements ApiVisitor {
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public void visit(UserApiElement userApiElement) {
        String result = restTemplate.getForObject("https://jsonplaceholder.typicode.com" + userApiElement.getEndpoint(), String.class);
        System.out.println("User API Result: " + result);
    }

    @Override
    public void visit(PostApiElement postApiElement) {
        String result = restTemplate.getForObject("https://jsonplaceholder.typicode.com" + postApiElement.getEndpoint(), String.class);
        System.out.println("Post API Result: " + result);
    }
}
