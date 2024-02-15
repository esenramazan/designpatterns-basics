package com.ramazan.thread.threadsinifigenisletilerek;

// Thread sınıfını genişleten bir sınıf oluşturuyoruz
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Değer: " + i);
        }
    }
}
