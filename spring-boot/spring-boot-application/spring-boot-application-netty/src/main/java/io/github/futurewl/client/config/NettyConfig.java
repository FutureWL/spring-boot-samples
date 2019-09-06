package io.github.futurewl.client.config;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
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
    public Bootstrap bootstrap() {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(nioEventLoopGroup());
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(new SimpleChannelInboundHandler<ByteBuf>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
                        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello".getBytes()));
                    }
                });
            }
        });
        return bootstrap;
    }

    @Override
    public void run(String... args) throws Exception {
        Bootstrap bootstrap = bootstrap();
        bootstrap.connect(new InetSocketAddress("localhost", 9999)).sync().addListener(future -> {
            if (future.isSuccess()) {
                log.info("服务器连接成功");
            }
        });
    }
}
