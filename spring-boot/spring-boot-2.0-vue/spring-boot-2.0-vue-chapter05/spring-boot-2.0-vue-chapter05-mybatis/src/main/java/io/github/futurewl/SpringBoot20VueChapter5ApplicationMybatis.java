package io.github.futurewl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.futurewl.mapper")
public class SpringBoot20VueChapter5ApplicationMybatis {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20VueChapter5ApplicationMybatis.class, args);
    }
}
