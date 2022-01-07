package org.crazyit.cloud;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * 定义一个Hello命令
 *
 * @author 杨恩雄
 */
public class HelloCommand extends HystrixCommand<String> {

    public HelloCommand() {
        // 调用父类的构造器，设置命令组的key
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
    }

    protected String run() throws Exception {
        // 模拟调用第三方服务，调用超时
        Thread.sleep(5000);
        return "success";
    }

    protected String getFallback() {
        System.out.println("调用超时，执行 HelloCommand 的回退方法");
        return "error";
    }
}
