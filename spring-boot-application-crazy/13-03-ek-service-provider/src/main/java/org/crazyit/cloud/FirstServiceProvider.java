package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class FirstServiceProvider {

    public static void main(String[] args) {
        // 读取控制台输入作为端口参数
        Scanner scan = new Scanner(System.in);
        String port = scan.nextLine();
        // 设置启动的服务器端口
        new SpringApplicationBuilder(FirstServiceProvider.class).properties(
                "server.port=" + port).run(args);
    }

    @GetMapping(value = "/person/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId,
                             HttpServletRequest request) {
        Person person = new Person(personId, "Crazyit", 30);
        person.setMessage(request.getRequestURL().toString());
        return person;
    }
}
