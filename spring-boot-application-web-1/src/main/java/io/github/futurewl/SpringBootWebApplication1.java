package io.github.futurewl;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 功能描述：Spring Boot Web 应用 1
 *
 * @author weilai
 */
@SpringBootApplication
public class SpringBootWebApplication1 {
    public static void main(String[] args) {

        // SpringApplication.run(SpringBootWebApplication1.class, args);

        new SpringApplicationBuilder(SpringBootWebApplication1.class)
                .bannerMode(Banner.Mode.OFF);
    }
}
