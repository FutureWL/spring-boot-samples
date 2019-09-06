package io.github.futurewl;

import io.github.futurewl.bean.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot20VueChapter2Application1Tests {

	//	@Autowired
//	User user;
	@Autowired
    Users users;

	@Test
	public void contextLoads() {
//		System.out.println(user);
		System.out.println(users);
	}

}
