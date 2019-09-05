package io.github.futurewl;

import java.util.concurrent.ExecutorService;

public class Executors {
    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName() + ":Hello");
                }
            });
        }
        System.out.println("hello");
    }
}
