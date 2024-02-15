package com.ramazan.designpatterns.structural.adapter.separated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main2 {

    private final MediaPlayer mediaPlayer;

    @Autowired
    public Main2(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @GetMapping("/oynatilan")
    public String oynatilanMedia() {
        mediaPlayer.play("mp3","xyz.mp3");
        return "basarili";
    }
}
