package com.ramazan.thread.multithread.synchali;

class MultithreadingDemo extends Thread {
    private Object lock = new Object();

    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
        }
    }
}

