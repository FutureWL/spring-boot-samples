package io.github.futurewl.spring.boot.webflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-21:23:50
 * @version 1.0
 */
@Configuration
public class RouterConfig {

    private final TimeHandler timeHandler;

    public RouterConfig(TimeHandler timeHandler) {
        this.timeHandler = timeHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> timerRouter() {
        return route(GET("/time"), timeHandler::getTime).
                andRoute(GET("/date"), timeHandler::getDate).
                andRoute(GET("/times"), timeHandler::sendTimePerSec);
    }
}
