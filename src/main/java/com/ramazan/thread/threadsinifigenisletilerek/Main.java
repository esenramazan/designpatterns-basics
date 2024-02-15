package com.ramazan.thread.threadsinifigenisletilerek;

// Ana sınıfımız
public class Main {
    public static void main(String args[]) {
//        MyThread t1 = new MyThread();
//        t1.start();
//
//        MyThread t2 = new MyThread();
//        t2.start();

        MySecondThread mySecondThread = new MySecondThread();
        mySecondThread.start();

        MySecondThread mySecondThread2 = new MySecondThread();
        mySecondThread2.start();

    }
}
