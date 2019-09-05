package io.github.futurewl.echo;

import io.github.futurewl.NettyChannel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;

import java.util.Date;

@ChannelHandler.Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        System.out.println("Server received:" + in.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
//        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            System.out.println("发送心跳");
            ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Hello".getBytes())).addListener(future -> {
                if (!future.isSuccess()) {
                    System.out.println("发送失败");
                } else if (future.isSuccess()) {
                    System.out.println("发送成功");
                }
            });
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Attribute<NettyChannel> attribute = ctx.attr(AttributeKey.valueOf("netty.channel"));
        NettyChannel nettyChannel = attribute.get();
        if (nettyChannel == null) {
            NettyChannel nettyChannel1 = new NettyChannel();
            nettyChannel1.setName("hello");
            nettyChannel.setCreateDate(new Date());
        } else {
            System.out.println("attributeMap 中是有值的");
            System.out.println(nettyChannel.getName() + "=======" + nettyChannel.getCreateDate());
        }
        System.out.println("新设备已连接");
        ctx.fireChannelActive();
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("设备断开连接");
    }
}
