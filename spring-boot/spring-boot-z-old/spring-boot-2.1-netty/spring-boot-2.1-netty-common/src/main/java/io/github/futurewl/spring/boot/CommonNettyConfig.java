package io.github.futurewl.spring.boot;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-04:22:23
 * @version 1.0
 */
@Configuration
public class CommonNettyConfig {

    @Bean(destroyMethod = "shutdownGracefully")
    public EventLoopGroup group() {
        return new NioEventLoopGroup();
    }

}
