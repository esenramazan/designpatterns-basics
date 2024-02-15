package com.ramazan.designpatterns.behavioral.mediator.messaging;

import jakarta.jms.*;

import javax.naming.*;

public class JmsProducerConsumerExample {
    public static void main(String[] args) throws NamingException, JMSException {
        // InitialContext nesnesi oluşturulur
        InitialContext ctx = new InitialContext();

        // ConnectionFactory ve Queue nesneleri alınır
        QueueConnectionFactory f = (QueueConnectionFactory) ctx.lookup("myQueueConnectionFactory");
        Queue queue = (Queue) ctx.lookup("myQueue");

        // Connection oluşturulur
        QueueConnection con = f.createQueueConnection();

        // Session oluşturulur
        QueueSession ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

        // Mesaj oluşturulur
        TextMessage msg = ses.createTextMessage();

        // Mesajın içeriği belirlenir
        msg.setText("Hello");

        // Mesaj gönderici oluşturulur ve mesaj gönderilir
        QueueSender sender = ses.createSender(queue);
        sender.send(msg);

        // Mesaj alıcı oluşturulur ve mesaj alınır
        QueueReceiver receiver = ses.createReceiver(queue);
        TextMessage msgin = (TextMessage) receiver.receive();

        // Alınan mesaj yazdırılır
        System.out.println("MESSAGE: " + msgin.getText());

        // Kaynaklar serbest bırakılır
        con.close();
    }
}

/***
 * Bu kodda belirgin bir şekilde tanımlanmış bir “Mediator” sınıfı bulunmamaktadır.
 * Ancak, “mediator” terimi genellikle, bir dizi nesne veya bileşen arasındaki
 * iletişimi yöneten bir tasarım modelini ifade eder.
 * Bu kodda, QueueSender ve QueueReceiver nesneleri, mesajların gönderilmesi ve alınması
 * arasındaki iletişimi yönetir. Bu nesneler, bir anlamda, bir “mediator” görevi görürler.
 * Ancak, bu nesneler doğrudan bir “Mediator” sınıfı olarak tanımlanmamıştır
 * ve bu kodda kullanılan tasarım modeli, klasik Mediator tasarım modeli değildir.
 * Bu kod, daha çok bir “messaging mediator” örneği olarak kullanılabilir çünkü bir
 * mesajın nasıl gönderileceğini ve alınacağını aracılar. Bu durumda,
 * JmsProducerConsumerExample sınıfı, bir “mediator” görevi görür çünkü mesaj gönderme
 * ve alma işlemlerini yönetir. Bu sınıf, QueueSender ve QueueReceiver nesnelerini kullanarak
 * bu işlemleri gerçekleştirir. Bu nedenle, JmsProducerConsumerExample sınıfı, bu kodda bir
 * “mediator” görevi görür.
 */
