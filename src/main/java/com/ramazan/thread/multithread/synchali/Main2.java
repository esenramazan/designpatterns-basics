package com.ramazan.thread.multithread.synchali;

public class Main2 {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        Thread previousThread = null;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            if (previousThread != null) {
                try {
                    previousThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            object.start();
            previousThread = object;
        }
    }
}
