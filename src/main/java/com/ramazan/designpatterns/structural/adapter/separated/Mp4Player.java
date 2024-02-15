package com.ramazan.designpatterns.structural.adapter.separated;

// Mp4PlayerInterface arayüzünü uygulayan Mp4Player sınıfı
public class Mp4Player implements Mp4PlayerInterface {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
