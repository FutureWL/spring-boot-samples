package io.github.futurewl.spring.boot;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-04:21:55
 * @version 1.0
 */
@Configuration
public class ServerNettyConfig {

    @Autowired
    public ServerChannelInitializer serverChannelInitializer;

    @Autowired
    public EventLoopGroup group;

    @Bean
    public ChannelGroup channelGroup() {
        return new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    }

    @Bean
    public ServerBootstrap serverBootstrap() {
        return new ServerBootstrap()
                .group(group, group)
                .channel(NioServerSocketChannel.class)
                .childHandler(serverChannelInitializer);
    }

}
