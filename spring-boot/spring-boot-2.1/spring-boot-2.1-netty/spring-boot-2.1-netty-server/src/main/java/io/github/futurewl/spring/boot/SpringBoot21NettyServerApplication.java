package io.github.futurewl.spring.boot;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：Netty Server 启动类
 *
 * @author weilai create by 2019-07-04:20:35
 * @version 1.0
 */
@SpringBootApplication
public class SpringBoot21NettyServerApplication implements CommandLineRunner {

    private final ServerBootstrap serverBootstrap;

    public SpringBoot21NettyServerApplication(ServerBootstrap serverBootstrap) {
        this.serverBootstrap = serverBootstrap;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21NettyServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ChannelFuture channelFuture = serverBootstrap.bind(8888).sync();
        channelFuture.channel().closeFuture().sync();
    }
}
