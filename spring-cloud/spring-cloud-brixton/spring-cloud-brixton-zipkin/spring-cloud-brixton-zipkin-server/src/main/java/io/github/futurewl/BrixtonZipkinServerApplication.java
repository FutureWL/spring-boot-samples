package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:42
 * @version 1.0
 */
@EnableZipkinServer
@SpringBootApplication
public class BrixtonZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrixtonZipkinServerApplication.class, args);
    }
}
