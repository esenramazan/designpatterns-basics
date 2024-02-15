package com.ramazan.designpatterns.behavioral.state;

// Main
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StateA());
        context.request();  // Handling request and changing to State B
        context.request();  // Handling request and staying in State B
    }
}


/***
 * Bu örnekte, Context sınıfı, State arayüzünün bir referansını tutar ve bu referans, StateA veya StateB gibi belirli bir durumu temsil eder.
 * request() çağrıldığında, Context’in mevcut durumu belirli bir işlemi gerçekleştirir ve durumu değiştirir.
 * Bu, nesnenin durumuna bağlı olarak farklı davranışları dinamik olarak değiştirmesine olanak sağlar.
 * Bu örnek, State Pattern’in nasıl kullanılabileceğini gösterir,
 * ancak gerçek dünya uygulamaları genellikle çok daha karmaşıktır.
 */
