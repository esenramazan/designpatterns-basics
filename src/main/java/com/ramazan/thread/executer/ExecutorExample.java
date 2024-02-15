package com.ramazan.thread.executer;

import java.util.concurrent.Executor;

public class ExecutorExample {
    public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start();

        executor.execute(() -> System.out.println("Merhaba Dünya!"));
    }
}

/*
 *Bu örnekte, Executor interface’ini kullanarak bir thread oluşturduk.execute() metodu, Runnable görevini çalıştırmak için kullanılır.
 * Bu örnekte, Runnable görevi bir lambda ifadesi ile sağladık
 */