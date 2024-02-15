package com.ramazan.thread.sync.sync;

public class Main {
    public static void main(String args[]) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();
    }
}
