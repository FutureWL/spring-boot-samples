package io.github.futurewl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:18:36
 * @version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DalstonHystrixDashboard {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DalstonHystrixDashboard.class)
                .properties("server.port=8082")
                .run(args);
    }

}
