package com.ramazan.solid.dependencyinversionprinciple.olumlu;

public class Email implements Message {
    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        // Send email
    }
}

