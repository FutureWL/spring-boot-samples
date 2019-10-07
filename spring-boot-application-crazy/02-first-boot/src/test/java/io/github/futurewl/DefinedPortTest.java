package io.github.futurewl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class DefinedPortTest {

    private RestTemplate restTpl = new RestTemplate();

    @Test
    public void testHello() {
        String result = restTpl.getForObject("http://localhost:8080/hello", String.class);
        System.out.println(result);
    }
}
