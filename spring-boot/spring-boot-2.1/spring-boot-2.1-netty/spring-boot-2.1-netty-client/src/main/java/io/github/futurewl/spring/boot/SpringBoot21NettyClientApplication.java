package io.github.futurewl.spring.boot;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-04:20:44
 * @version 1.0
 */
@SpringBootApplication
public class SpringBoot21NettyClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21NettyClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 50; i++) {
            EventLoopGroup group = new NioEventLoopGroup();
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new SimpleChannelInboundHandler<ByteBuf>() {

                        @Override
                        protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {

                        }

                        @Override
                        public void channelActive(ChannelHandlerContext ctx) throws Exception {
                            super.channelActive(ctx);
                            ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Hello".getBytes()));
                        }
                    }).connect("localhost", 8888).sync();
        }
    }
}
