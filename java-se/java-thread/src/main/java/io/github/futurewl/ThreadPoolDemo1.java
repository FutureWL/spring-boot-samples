package io.github.futurewl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        // 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        // 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
//        ExecutorService fixedThreadPool = Executors.newFixedThreadPool();
        // 创建一个定长线程池，支持定时及周期性任务执行。
//        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool();
        // 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
//        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        //
//        ExecutorService workStealingPool = Executors.newWorkStealingPool();
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            final int finalI = i;
            cachedThreadPool.execute(() -> System.out.println("当前执行的 idx=" + finalI));
            int threadCount = ((ThreadPoolExecutor) cachedThreadPool).getActiveCount();//这边有事获取的是1有时是0
            System.out.println("当前活动的线程数 for=" + threadCount);
            int poolCount = ((ThreadPoolExecutor) cachedThreadPool).getPoolSize();
            System.out.println("当前池线程数 for=" + poolCount); //这边使用了缓存的线程，获取到的线程数一直视1
        }
        int threadCount = ((ThreadPoolExecutor) cachedThreadPool).getActiveCount();
        System.out.println("当前活动的线程数=" + threadCount);
        int poolCount = ((ThreadPoolExecutor) cachedThreadPool).getPoolSize();
        System.out.println("当前池线程数=" + poolCount);
    }
}
