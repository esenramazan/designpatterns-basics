package com.ramazan.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State 1");
        subject.setState("State 2");
    }
}

/**
 * Bu örnekte, ConcreteSubject sınıfı bir "subject"i (gözlemlenen nesne)
 * ve ConcreteObserver sınıfı bir "observer"ı (gözlemci nesne) temsil eder.
 * ConcreteSubject sınıfı, Subject sınıfından türer ve getState, setState ve notifyObservers gibi metotlara sahiptir.
 * ConcreteObserver sınıfı, Observer arayüzünü uygular ve update metodu ile ConcreteSubject sınıfının durumundaki değişikliklere yanıt verir
 * Main sınıfında, iki ConcreteObserver nesnesi oluşturulur ve ConcreteSubject nesnesine eklenir.
 * Sonra, ConcreteSubject nesnesinin durumu iki kez değiştirilir ve her değişiklikten sonra notifyObservers metodu çağrılır.
 * Bu metot, ConcreteSubject nesnesine eklenen tüm ConcreteObserver nesnelerinin update metodunu çağırır.
 * Bu, Observer tasarım kalıbının tipik bir kullanım örneğidir.
 * Bu kalıp, özellikle bir nesnenin durumundaki değişikliklerin birden çok nesneye otomatik olarak bildirilmesi gerektiğinde kullanışlıdır
 * (örneğin, bir yayıncı/abone modelinde).
 */
