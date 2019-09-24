package io.github.futurewl;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.CharsetUtil;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NettyServer {
    public static void main(String[] args) throws InterruptedException {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workGroup = new NioEventLoopGroup();
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        try {
            serverBootstrap.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline()
                                    .addLast(new IdleStateHandler(1L, 1L, 1L, TimeUnit.SECONDS))
                                    .addLast(new SimpleChannelInboundHandler<ByteBuf>() {
                                        @Override
                                        protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
                                            System.out.println(msg.toString(CharsetUtil.UTF_8));
                                        }

                                        @Override
                                        public void channelInactive(ChannelHandlerContext ctx) throws Exception {
                                            System.out.println("inactive");
                                        }

                                        @Override
                                        public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
                                            System.out.println("unregistered");
                                        }

                                        @Override
                                        public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
                                            if (evt instanceof IdleStateEvent) {
                                                ctx.channel().writeAndFlush(
                                                        Unpooled.copiedBuffer(("Idle:" + new Date()).getBytes())).addListener(future -> {
                                                    if (future.isSuccess()) {
                                                        System.out.println("发送成功");
                                                    } else {
                                                        System.out.println("发送失败");
                                                    }
                                                });
                                                System.out.println("Idle:" + new Date());
                                            }
                                        }

                                        @Override
                                        public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                            System.out.println("active");
                                        }

                                        @Override
                                        public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
                                            System.out.println("registered");
                                        }
                                    });
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .bind(9989).sync()
//                    .addListener(future -> {
//                        if (future.isSuccess()) {
//                            System.out.println("服务器启动成功！");
//                        }
//                    })
                    .channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }
}
