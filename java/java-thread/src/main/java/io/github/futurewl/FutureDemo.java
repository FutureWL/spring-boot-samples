package io.github.futurewl;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class FutureDemo {
    public static void main(String[] args) {
        MyCallable callable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        String res = null;
        try {

            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.submit(futureTask);


            new Thread(futureTask, "线程1").start();
            res = futureTask.get();
            System.out.println("哈哈哈哈");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {


        for (int i = 0; i < 3; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("等待:" + i);

        }

        return "success";
    }
}
