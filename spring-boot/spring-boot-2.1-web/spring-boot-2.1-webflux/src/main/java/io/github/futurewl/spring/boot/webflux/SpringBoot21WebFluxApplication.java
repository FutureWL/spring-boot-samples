package io.github.futurewl.spring.boot.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-01-31:12:52
 * @version 1.0
 */
@RestController
@SpringBootApplication
public class SpringBoot21WebFluxApplication {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Welcome to reactive world~");
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21WebFluxApplication.class, args);
    }

}
