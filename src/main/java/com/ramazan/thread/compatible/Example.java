package com.ramazan.thread.compatible;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Example {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Executor executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 15; i++) {
            CompletableFuture.supplyAsync(() -> calculate(), executor)
                    .thenAccept(result -> System.out.println("Thread: " + Thread.currentThread().getName() + ", Result: " + result));
        }
    }

    private static int calculate() {
        // Burada karmaşık bir hesaplama yapılıyor olabilir.
        // Bu örnekte, basitlik adına, sadece bir sabit değer döndürüyoruz.
        return 42;
    }
}