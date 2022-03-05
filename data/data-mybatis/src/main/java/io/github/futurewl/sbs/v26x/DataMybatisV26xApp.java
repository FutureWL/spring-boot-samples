package io.github.futurewl.sbs.v26x;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.futurewl.sbs.v26x.mapper")
public class DataMybatisV26xApp {
    public static void main(String[] args) {
        SpringApplication.run(DataMybatisV26xApp.class, args);
    }
}
