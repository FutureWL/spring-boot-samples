package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@SpringBootApplication
public class SpringBootWebFirstApp {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("success");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebFirstApp.class, args);
    }
}
