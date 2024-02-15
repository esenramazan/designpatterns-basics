package com.ramazan.designpatterns.structural.adapter.separated;

// VlcPlayerInterface ve Mp4PlayerInterface arayüzlerini birleştiren MediaAdapter sınıfı
public class MediaAdapter implements MediaPlayer {
    VlcPlayerInterface vlcPlayer;
    Mp4PlayerInterface mp4Player;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        }
    }
}
