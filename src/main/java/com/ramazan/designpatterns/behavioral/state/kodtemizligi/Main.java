package com.ramazan.designpatterns.behavioral.state.kodtemizligi;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.promote();  // User is now active.
        user.promote();  // User is now inactive.
        user.promote();  // User is now new again.
    }
}


/***
 * Bu Main sınıfı, User nesnesinin promote metodunu çağırarak durum değişikliklerini simüle eder.
 * Her promote çağrısında, User nesnesinin durumu ve dolayısıyla davranışı değişir.
 * Bu, State Pattern’in nasıl çalıştığını gösterir.
 */
