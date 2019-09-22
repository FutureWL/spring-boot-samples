package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:16:57
 * @version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class BrixtonHystrixDashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrixtonHystrixDashBoardApplication.class, args);
    }
}
