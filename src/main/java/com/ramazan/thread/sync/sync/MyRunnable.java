package com.ramazan.thread.sync.sync;

class MyRunnable implements Runnable {
    private int count = 0;

    public synchronized void incrementCount() {
        count++;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            incrementCount();
            System.out.println(Thread.currentThread().getId() + " Değer: " + count);
        }
    }
}

