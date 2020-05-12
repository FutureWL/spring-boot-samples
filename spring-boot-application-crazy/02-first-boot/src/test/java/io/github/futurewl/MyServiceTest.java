package io.github.futurewl;

import io.github.futurewl.demo1.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void testHello() {
        String result = myService.helloService();
        System.out.println(result);
    }
}
