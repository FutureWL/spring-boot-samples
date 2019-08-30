package io.github.futurewl.spring.boot.starter.netty.server;

import io.github.futurewl.spring.boot.starter.netty.server.properties.NettyServerProperties;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFutureListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(
        io.github.futurewl.spring.boot.starter.netty.server.properties.NettyServerProperties.class)
public class SpringBootStarterNettyServerAutoConfiguration implements CommandLineRunner {

    private final ServerBootstrap serverBootstrap;
    private final NettyServerProperties nettyServerProperties;

    public SpringBootStarterNettyServerAutoConfiguration(
            ServerBootstrap serverBootstrap,
            NettyServerProperties nettyServerProperties) {
        this.serverBootstrap = serverBootstrap;
        this.nettyServerProperties = nettyServerProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        start();
    }

    private void start() throws InterruptedException {
        serverBootstrap.bind(nettyServerProperties.getPort()).sync()
                .addListener((ChannelFutureListener) future -> {
                    // 如果操作成功，打印消息
                    if (future.isSuccess()) {
                        if (log.isInfoEnabled()) {
                            log.info("[{}服务启动成功! 正在监听：{}]", "Netty服务", nettyServerProperties.getPort());
                        }
                    }
                    // 如果发生错误，则访问描述原因的 Throwable
                    else {
                        Throwable cause = future.cause();
                        cause.printStackTrace();
                    }
                }).channel().closeFuture();
    }
}
