package com.ramazan.solid.dependencyinversionprinciple.olumlu;

public class Notification {
    private Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public void send() {
        message.sendMessage();
    }
}

/*
   Bu örnekler, bir sınıfın, metodun ya da özelliğin, onu kullanan diğer sınıflara karşı olan bağımlılığının en aza indirgenmesi gerektiğini
    ve bu durumun kodun daha esnek ve bakımı daha kolay olmasını sağladığını göstermektedir.


    Dependency Inversion Prensibi (DIP), yüksek seviye modüllerin düşük seviye modüllere doğrudan bağımlı olmaması gerektiğini belirtir.
    Bunun yerine, modüller arasındaki bağımlılıklar soyutlamalar aracılığıyla yönetilir.
    Bu, genellikle dependency injection ile gerçekleştirilir.

DIP, Open-Closed Prensibi (OCP) ile de yakından ilişkilidir.
OCP, bir sınıfın yeni işlevler eklemek için açık ancak mevcut kodu değiştirmek için kapalı olması gerektiğini belirtir.
Yani, bir sınıfın davranışını değiştirmek için sınıfın kendisini değiştirmemiz gerekmez.
Bunun yerine, yeni işlevler eklemek için sınıfı genişletebiliriz.

Bu prensipler, kodun daha esnek, bakımı daha kolay ve yeniden kullanılabilir olmasını sağlar.
 Bu nedenle, “az bağımlılık” ifadesi, yüksek seviye modüllerin düşük seviye modüllere doğrudan bağımlı olmaması gerektiği anlamına gelir.
 Bunun yerine, bağımlılıklar soyutlamalar aracılığıyla yönetilir ve bu, genellikle dependency injection ile gerçekleştirilir.
*/