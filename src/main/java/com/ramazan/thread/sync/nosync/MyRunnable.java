package com.ramazan.thread.sync.nosync;

class MyRunnable implements Runnable {
    private int count = 0;

    public void run() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getId() + " Değer: " + count);
        }
    }
}

