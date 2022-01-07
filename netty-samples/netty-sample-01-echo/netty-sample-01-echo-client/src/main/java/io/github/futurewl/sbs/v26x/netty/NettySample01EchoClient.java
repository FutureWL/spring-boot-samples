package io.github.futurewl.sbs.v26x.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.InetSocketAddress;

/**
 * 功能描述：SpringBoot v26x NettyEcho 服务演示案例
 *
 * @author weilai 2022-01-07
 * @version 1.0
 */
@Slf4j
@SpringBootApplication
public class NettySample01EchoClient implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NettySample01EchoClient.class, args);
    }


    /**
     * 功能描述：NioEventLoop 注入Bean
     *
     * @return 返回对象
     */
    @Bean(destroyMethod = "shutdownGracefully")
    public EventLoopGroup nioEventLoopGroup() {
        return new NioEventLoopGroup();
    }

    @Bean
    public Bootstrap bootstrap() {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(nioEventLoopGroup());
        bootstrap.channel(NioSocketChannel.class);
        return bootstrap;
    }

    @Bean
    public ChannelInitializer<SocketChannel> channelChannelInitializer() {
        return new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(channelInboundHandlerAdapter());
            }
        };
    }

    @Bean
    public ChannelInboundHandlerAdapter channelInboundHandlerAdapter() {
        return new ChannelInboundHandlerAdapter() {
            @Override
            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                super.channelRead(ctx, msg);
            }

            @Override
            public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
                super.channelReadComplete(ctx);
            }

            @Override
            public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
                cause.printStackTrace();
                ctx.channel().closeFuture();
            }

            @Override
            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                log.info("服务端已经连接");
            }
        };
    }

    @Override
    public void run(String... args) throws Exception {
        int port = 9999;
        String remoteHost = "127.0.0.1";
        Bootstrap bootstrap = bootstrap();
        bootstrap.handler(channelChannelInitializer());
        bootstrap.localAddress(new InetSocketAddress(port));
        bootstrap.connect(remoteHost, port).sync().addListener((ChannelFutureListener) future -> {
            if (future.isSuccess()) {
                log.info("客户端启动成功！监听端口：" + port);
            }
        });
    }
}
