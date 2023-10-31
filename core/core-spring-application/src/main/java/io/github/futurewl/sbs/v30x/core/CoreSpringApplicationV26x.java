package io.github.futurewl.sbs.v31x.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CoreSpringApplicationV26x {

    /**
     * 功能描述：通过委托 SpringApplication.run() 方法启动 SpringBootApplication
     *
     * @param args
     */
    public static void main(String[] args) {

        //        SpringApplication.run(CoreSpringApplicationV26x.class, args);

        new SpringApplicationBuilder()
                .sources(CoreSpringApplicationV26x.class)
//                .parent(CoreSpringApplicationV26x.class)
//                .child(CoreSpringApplicationV26x.class)
//                .bannerMode(Banner.Mode.OFF)
                .run(args);

    }

}
