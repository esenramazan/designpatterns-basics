package com.ramazan.designpatterns.behavioral.mediator;

import java.util.ArrayList;

// Main class
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl(new ArrayList<>());
        User user1 = new UserImpl(mediator, "User 1");
        User user2 = new UserImpl(mediator, "User 2");
        User user3 = new UserImpl(mediator, "User 3");
        User user4 = new UserImpl(mediator, "User 4");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user2.send("Hello World");
    }
}


/***
 * Mediator Pattern, Spring Boot uygulamalarında çeşitli şekillerde kullanılabilir. İşte bazı örnekler:
 *
 * Event Handling: Spring Framework, uygulama olaylarını (events) yayınlamak ve işlemek için bir olay yayıncısı (event publisher) ve
 * olay dinleyicileri (event listeners) sağlar1. Bu, bir Mediator Pattern örneğidir çünkü olay yayıncısı, olayların dinleyicilere iletilmesini yönetir1.
 *
 * Messaging: Spring Boot, JMS (Java Message Service) ve AMQP (Advanced Message Queuing Protocol) gibi mesajlaşma protokollerini destekler1.
 * Bu protokollerde, bir mesaj broker’ı (message broker), mesajların üreticilerden (producers) tüketicilere (consumers) iletilmesini yönetir1. Bu da bir Mediator Pattern örneğidir1.
 *
 * Web Controllers: Spring MVC’de, bir web controller, istemciden gelen HTTP isteklerini işler ve uygun hizmetlere yönlendirir1.
 * Bu, bir Mediator Pattern örneğidir çünkü web controller, istemci ve hizmetler arasındaki iletişimi yönetir1.
 *
 * Integration Flows: Spring Integration, uygulama bileşenleri arasındaki entegrasyon akışlarını tanımlamak için bir DSL (Domain Specific Language) sağlar1.
 * Bu akışlar, bir Mediator Pattern örneğidir çünkü entegrasyon akışları, bileşenler arasındaki iletişimi yönetir1.
 *
 * Bu örnekler, Spring Boot’ta Mediator Pattern’ın nasıl kullanılabileceğine dair bir fikir verir. Ancak, bu pattern’ın kullanımı uygulamanın gereksinimlerine ve karmaşıklığına bağlıdır1.
 * Mediator Pattern, nesneler arasındaki iletişimi merkezileştirerek kodun daha kolay bakım ve genişletme imkanı sunar1. Ancak, bu pattern’ın gereksiz yere kullanılması, kodun karmaşıklığını artırabilir
 * ve performansı düşürebilir1. Bu nedenle, Mediator Pattern’ı kullanırken dikkatli olunmalıdır
 */
