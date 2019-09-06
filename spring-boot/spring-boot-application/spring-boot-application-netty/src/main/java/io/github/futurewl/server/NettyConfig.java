package io.github.futurewl.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;

/**
 * 功能描述：Netty 配置类
 *
 * @author weilai
 */
@Slf4j
@Configuration
public class NettyConfig implements CommandLineRunner {

    /**
     * NioEventLoop 注入Bean
     *
     * @return
     */
    @Bean(destroyMethod = "shutdownGracefully")
    public EventLoopGroup nioEventLoopGroup() {
        return new NioEventLoopGroup();
    }

    @Bean
    public ServerBootstrap serverBootstrap() {
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(nioEventLoopGroup(), nioEventLoopGroup());
        serverBootstrap.channel(NioServerSocketChannel.class);
        return serverBootstrap;
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
                log.info("客户端已经连接");
            }
        };
    }

    @Override
    public void run(String... args) throws Exception {
        int port = 9999;
        ServerBootstrap serverBootstrap = serverBootstrap();
        serverBootstrap.childHandler(channelChannelInitializer());
        serverBootstrap.localAddress(new InetSocketAddress(port));
        serverBootstrap.bind().sync().addListener((ChannelFutureListener) future -> {
            if (future.isSuccess()) {
                log.info("服务器启动成功！监听端口：" + port);
            }
        });
    }
}
