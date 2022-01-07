package io.github.futurewl;

import io.github.futurewl.demo1.service.MainService;
import io.github.futurewl.demo1.service.RemoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockTest {

    @MockBean
    private RemoteService remoteService;

    @Autowired
    private MainService mainService;

    @Test
    public void testMainService() {
        // 模拟 removeService 的 call 方法返回 angus
        BDDMockito.given(this.remoteService.call()).willReturn("angus");
        mainService.mainService();
    }
}
