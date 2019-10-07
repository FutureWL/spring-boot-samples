package org.crazyit.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class FileProfile {

    public static void main(String[] args) {
        // 读取控制台输入
        Scanner scan = new Scanner(System.in);
        String profiles = scan.nextLine();
        new SpringApplicationBuilder(FileProfile.class).profiles(profiles).run(args);
    }

    @Autowired
    private Environment env;

    @GetMapping("/driver")
    public String getProp() {
        System.out.println(env.getProperty("jdbc.driver"));
        return "";
    }

}
