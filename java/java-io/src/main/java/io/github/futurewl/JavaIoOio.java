package io.github.futurewl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class JavaIoOio {

    public static void main(String[] args) {

    }

    public void server(int port) throws IOException {
        final ServerSocket socket = new ServerSocket(port); // 创建一个 socket 对象
        try {
            for (; ; ) {
                final Socket clientSocket = socket.accept(); // 接受连接
                System.out.println("Accepted connection from " + clientSocket);
                new Thread(() -> { // 创建一个新的线程来处理该连接
                    OutputStream out;
                    try {
                        out = clientSocket.getOutputStream();
                        out.write("Hi\r\n".getBytes(StandardCharsets.UTF_8)); // 将消息写给已连接的客户端
                        out.flush();
                        clientSocket.close(); // 关闭连接
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
