package io.github.futurewl.sbs.v26x.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreSpringApplicationV26x {

    /**
     * 功能描述：通过委托 SpringApplication.run() 方法启动 SpringBootApplication
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CoreSpringApplicationV26x.class, args);
    }

}
