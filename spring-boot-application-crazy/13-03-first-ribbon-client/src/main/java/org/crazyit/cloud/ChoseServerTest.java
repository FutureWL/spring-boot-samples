package org.crazyit.cloud;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.ArrayList;
import java.util.List;

public class ChoseServerTest {

    public static void main(String[] args) {
        // 创建负载均衡器
        BaseLoadBalancer lb = new BaseLoadBalancer();
        // 添加服务器
        List<Server> servers = new ArrayList<Server>();
        servers.add(new Server("localhost", 8080));
        servers.add(new Server("localhost", 8081));
        lb.addServers(servers);
        // 进行6次服务器选择
        for (int i = 0; i < 6; i++) {
            Server s = lb.chooseServer(null);
            System.out.println(s);
        }
    }
}
