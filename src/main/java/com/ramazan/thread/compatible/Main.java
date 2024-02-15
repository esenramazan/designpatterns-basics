package com.ramazan.thread.compatible;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        for(int i = 0 ; i < 11;i++) {
            islemYap(i);
        }
        for(int i = 0 ; i<1000;i++) {
            int a = 5/5;
        }

    }


    public static void islemYap(int count) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Bu kod bloğu, bir thread üzerinde asenkron olarak çalışır
            System.out.println("Merhaba, Dünya!"+count);
        });
    }
}
