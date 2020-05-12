package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BookApp {


    // 数据列表每页的数据量
    public final static int PAGE_SIZE = 5;

    public static void main(String[] args) {
        SpringApplication.run(BookApp.class, args);
    }

}
