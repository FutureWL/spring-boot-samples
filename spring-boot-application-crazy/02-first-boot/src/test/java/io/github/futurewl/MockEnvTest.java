package io.github.futurewl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class MockEnvTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHello() throws Exception {
        ResultActions ra = mvc.perform(MockMvcRequestBuilders.get(new URI(
                "/hello")));
        MvcResult result = ra.andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}
