package com.ramazan.designpatterns.behavioral.observer.ornek;

public class PersonelActivityImpl extends PersonelActivity{
    public void bilgilendirmeyiYap(String bilgilendirme) {
        informActivitiesToManagers(bilgilendirme);
    }
}
