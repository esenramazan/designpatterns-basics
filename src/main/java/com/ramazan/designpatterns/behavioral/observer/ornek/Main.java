package com.ramazan.designpatterns.behavioral.observer.ornek;

public class Main {


    public static void main(String[] args) {
        Manager ustManager = new ManagerImpl("İsmail");
        Manager altManager = new ManagerImpl("Ramazan");

        PersonelActivity personelActivity = new PersonelActivityImpl();

        personelActivity.subscribe(ustManager);

        personelActivity.informActivitiesToManagers("Personel Giriş Yaptı");
        personelActivity.subscribe(altManager);

        personelActivity.informActivitiesToManagers("Personel sayısal oynuyor");

    }



}
