package io.github.futurewl.sprng.boot.web.beetl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述：Beetl 应用启动
 *
 * @author weilai create by 2018-12-07:12:40
 * @version 1.0
 */
@SpringBootApplication
public class BeetlApplication {

    @RequestMapping("/user-detail.html")
    public String foo(String id) {
        return "/admin/userInfo.btl";
    }

    public static void main(String[] args) {
        SpringApplication.run(BeetlApplication.class, args);
    }

}
