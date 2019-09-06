package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Book.class)
public class SpringBoot2VueChapter2Application3 {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2VueChapter2Application3.class, args);
	}
}
