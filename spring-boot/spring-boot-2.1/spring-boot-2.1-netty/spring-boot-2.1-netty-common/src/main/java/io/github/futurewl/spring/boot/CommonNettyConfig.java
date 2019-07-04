package io.github.futurewl.spring.boot;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
