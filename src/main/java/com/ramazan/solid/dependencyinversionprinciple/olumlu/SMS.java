package com.ramazan.solid.dependencyinversionprinciple.olumlu;

public class SMS implements Message {
    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        // Send SMS
    }
}
