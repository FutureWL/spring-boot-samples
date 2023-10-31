package io.github.futurewl.sbs.v31x;

import io.github.futurewl.sbs.v31x.entity.User;
import io.github.futurewl.sbs.v31x.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DataMybatisPlusV26xAppTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
