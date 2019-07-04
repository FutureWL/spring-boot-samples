package io.github.futurewl.spring.boot;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-04:22:05
 * @version 1.0
 */
@Configuration
public class ClientNettyConfig {

    @Autowired
    private ClientChannelInitializer clientChannelInitializer;

    @Autowired
    private EventLoopGroup group;

    @Bean
    public Bootstrap bootstrap() {
        return new Bootstrap().group(group)
                .channel(NioSocketChannel.class)
                .handler(clientChannelInitializer);
    }


}
