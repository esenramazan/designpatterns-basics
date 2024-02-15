package com.ramazan.thread.runnablefunctionalinterfaceiile;

// Runnable arayüzünü uygulayan bir sınıf oluşturuyoruz
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Değer: " + i);
        }
    }
}
