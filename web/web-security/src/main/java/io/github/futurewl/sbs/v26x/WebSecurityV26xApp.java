package io.github.futurewl.sbs.v26x;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 参考博客：https://blog.csdn.net/qq_22075913/article/details/125148535
 */
@SpringBootApplication
@MapperScan("io.github.futurewl.sbs.v26x.mapper")
public class WebSecurityV26xApp {
    public static void main(String[] args) {
        SpringApplication.run(WebSecurityV26xApp.class, args);
    }
}
