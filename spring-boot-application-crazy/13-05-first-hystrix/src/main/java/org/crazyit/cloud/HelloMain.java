package org.crazyit.cloud;

public class HelloMain {

    public static void main(String[] args) {
        // 创建命令
        HelloCommand command = new HelloCommand();
        String result = command.execute();
        System.out.println("请求正常的服务，结果：" + result);
    }
}
