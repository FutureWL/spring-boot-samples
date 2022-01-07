package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class TestProfile {

    public static void main(String[] args) {
        // 读取控制台输入
        Scanner scan = new Scanner(System.in);
        String profile = scan.nextLine();
//        new SpringApplicationBuilder(
//                TestProfile.class)
//                .properties(
//                        "spring.config.location=classpath:/test-profile.yml")
//                .properties("spring.profiles.active=" + profile).run(args);
        new SpringApplicationBuilder(
                TestProfile.class)
                .properties(
                        "spring.config.location=classpath:/test-profile.yml")
                .profiles(profile).run(args);
    }

    @Autowired
    private Environment env;

    @GetMapping("/tp")
    public String getProp() {
        System.out.println(env.getProperty("jdbc.driver"));
        return "";
    }
}
