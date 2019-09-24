package io.github.futurewl;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.CharsetUtil;

public class NettyClient {
    public static void main(String[] args) throws InterruptedException {
//        String host = "47.96.122.117";
//        int port = 11010;
        String host = "localhost";
        int port = 9989;
        Bootstrap bootstrap = new Bootstrap();
        final EventLoopGroup group = new NioEventLoopGroup();
        bootstrap.group(group).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(new SimpleChannelInboundHandler<ByteBuf>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
                        System.out.println(msg.toString(CharsetUtil.UTF_8));
                    }

                    @Override
                    public void channelActive(ChannelHandlerContext ctx) throws Exception {
                        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Client -> Hello123123".getBytes(CharsetUtil.UTF_8)));
                        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Client -> Hello123123".getBytes(CharsetUtil.UTF_8)));
                        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Client -> Hello123123".getBytes(CharsetUtil.UTF_8)));
                        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Client -> Hello123123".getBytes(CharsetUtil.UTF_8)));
                    }
                });
            }
        }).connect(host, port).sync().addListener(future -> {
            if (future.isSuccess()) {
                System.out.println("连接成功");
            }
        });
    }
}
