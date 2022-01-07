package io.github.futurewl.sbs.v21.job;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyFirstJob {

    public void sayHello() {
        System.out.println("MyFirstJob:sayHello:" + new Date());
    }
}
