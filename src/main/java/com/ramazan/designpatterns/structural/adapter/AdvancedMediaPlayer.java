package com.ramazan.designpatterns.structural.adapter;

// Yeni bir media tipini desteklemek için AdvancedMediaPlayer arayüzü
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
