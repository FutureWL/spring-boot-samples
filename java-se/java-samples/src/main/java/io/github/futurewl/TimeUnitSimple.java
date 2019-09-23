package io.github.futurewl;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeUnitSimple {
    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                System.out.println(new Date()+":OK");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
