package com.ramazan.solid.dependencyinversionprinciple.olumsuz;

public class Notification {
    private Email email = new Email();
    private SMS sms = new SMS();

    public void send() {
        email.sendEmail();
        sms.sendSMS();
    }
}

/*
 *Notification sınıfı, DIP’yi ihlal eder. Çünkü Notification sınıfı, Email ve SMS sınıflarına bağımlıdır.
 */