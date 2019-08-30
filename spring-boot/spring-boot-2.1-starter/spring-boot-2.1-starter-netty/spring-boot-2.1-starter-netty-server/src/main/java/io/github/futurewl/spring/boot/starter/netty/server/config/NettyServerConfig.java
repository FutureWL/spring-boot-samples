package io.github.futurewl.spring.boot.starter.netty.server.config;

import io.github.futurewl.spring.boot.starter.netty.server.netty.ServerChannelInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettyServerConfig {

    @Bean(destroyMethod = "shutdownGracefully")
    public EventLoopGroup group() {
        return new NioEventLoopGroup();
    }


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
