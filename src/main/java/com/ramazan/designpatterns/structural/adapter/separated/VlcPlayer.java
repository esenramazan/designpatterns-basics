package com.ramazan.designpatterns.structural.adapter.separated;

// VlcPlayerInterface arayüzünü uygulayan VlcPlayer sınıfı
public class VlcPlayer implements VlcPlayerInterface {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}

