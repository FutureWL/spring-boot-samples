package io.github.futurewl;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBoot20VueChapter1Application2 {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBoot20VueChapter1Application2.class);
		builder.bannerMode(Banner.Mode.OFF).run(args);
	}
}
