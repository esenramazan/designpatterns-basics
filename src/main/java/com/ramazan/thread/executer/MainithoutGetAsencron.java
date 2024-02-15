package com.ramazan.thread.executer;

import java.util.concurrent.CompletableFuture;

public class MainithoutGetAsencron {


        public static void main(String[] args) {
            // Bir CompletableFuture oluşturuyoruz
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                // Bu kod bloğu, bir thread üzerinde asenkron olarak çalışır
                System.out.println("Merhaba, Dünya!");
            });

            // Diğer işlemler burada gerçekleştirilebilir...

            // CompletableFuture.get() metodu çağrılmadan önce, CompletableFuture'in işlemi zaten asenkron olarak çalışmaya başlar



            for(int i = 0 ; i<1000;i++) {
                int a = 5/5;
            }


        }

}
