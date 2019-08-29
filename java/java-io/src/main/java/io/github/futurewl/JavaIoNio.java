package io.github.futurewl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class JavaIoNio {

    public void server(int port) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        InetSocketAddress address = new InetSocketAddress(port); // 将服务器绑定到选定的端口
        serverSocket.bind(address);
        Selector selector = Selector.open(); // 打开 Selector 来处理 Channel
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);// 将 ServerSocket 注册到 Selector 以接受连接
        final ByteBuffer msg = ByteBuffer.wrap("Hi!\r\n".getBytes());
        for (; ; ) {
            try {
                selector.select(); // 等待需要处理的新事件；阻塞将一直持续到下一个传入事件
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
            Set<SelectionKey> readKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = readKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                try {
                    if (key.isAcceptable()) {
                        ServerSocketChannel server = (ServerSocketChannel) key.channel();
                        SocketChannel client = server.accept();
                        client.configureBlocking(false);
                        client.register(selector, SelectionKey.OP_WRITE | SelectionKey.OP_READ, msg.duplicate());
                        System.out.println("Accepted connection from " + client);
                        if (key.isWritable()) {
                            client = (SocketChannel) key.channel();
                            ByteBuffer buffer = (ByteBuffer) key.attachment();
                            while (buffer.hasRemaining()) {
                                if (client.write(buffer) == 0) break;
                            }
                            client.close();
                        }
                    }
                } catch (IOException e) {
                    key.channel();
                    try {
                        key.channel().close();
                    } catch (IOException cex) {
                        // ignore on close
                    }
                }
            }
        }
    }
}
