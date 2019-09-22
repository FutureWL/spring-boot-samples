package io.github.futurewl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:25
 * @version 1.0
 */
@EnableZuulProxy
@SpringBootApplication
public class BrixtonApiGatewayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BrixtonApiGatewayApplication.class)
                .web(true)
                .run(args);
    }
}
