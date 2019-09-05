package io.github.futurewl;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import org.junit.Test;

import static org.junit.Assert.*;

public class FixedLengthFrameDecoderTest {

    @Test
    public void testFrameDecoder() {
        ByteBuf byteBuf = Unpooled.buffer();
        for (int i = 0; i < 9; i++) {
            byteBuf.writeByte(i);
        }
        ByteBuf input = byteBuf.duplicate();
        EmbeddedChannel channel = new EmbeddedChannel(new FixedLengthFrameDecoder(3));

        assertTrue(channel.writeInbound(input.retain()));
        assertTrue(channel.finish());

        ByteBuf read = channel.readInbound();
        assertEquals(byteBuf.readSlice(3), read);
        read.release();

        read = channel.readInbound();
        assertEquals(byteBuf.readSlice(3), read);
        read.release();

        read = channel.readInbound();
        assertEquals(byteBuf.readSlice(3), read);
        read.release();

        assertNull(channel.readInbound());
        byteBuf.release();
    }

    @Test
    public void testFrameDecoder2() {
        ByteBuf byteBuf = Unpooled.buffer();
        for (int i = 0; i < 9; i++) {
            byteBuf.writeByte(i);
        }
        ByteBuf input = byteBuf.duplicate();
        EmbeddedChannel channel = new EmbeddedChannel(new FixedLengthFrameDecoder(3));

        assertFalse(channel.writeInbound(input.readBytes(2)));
        assertTrue(channel.writeInbound(input.readBytes(7)));

        assertTrue(channel.finish());

        ByteBuf read = channel.readInbound();
        assertEquals(byteBuf.readSlice(3), read);
        read.release();

        read = channel.readInbound();
        assertEquals(byteBuf.readSlice(3), read);
        read.release();

        read = channel.readInbound();
        assertEquals(byteBuf.readSlice(3), read);
        read.release();

        assertNull(channel.readInbound());
        byteBuf.release();
    }

}
