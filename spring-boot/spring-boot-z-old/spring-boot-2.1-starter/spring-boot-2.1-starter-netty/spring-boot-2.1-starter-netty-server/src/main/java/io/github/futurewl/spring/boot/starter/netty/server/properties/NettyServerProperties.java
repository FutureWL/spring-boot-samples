package io.github.futurewl.spring.boot.starter.netty.server.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "netty.server")
public class NettyServerProperties {

    /**
     * netty 监听端口号
     */
    private int port = 8888;

}
