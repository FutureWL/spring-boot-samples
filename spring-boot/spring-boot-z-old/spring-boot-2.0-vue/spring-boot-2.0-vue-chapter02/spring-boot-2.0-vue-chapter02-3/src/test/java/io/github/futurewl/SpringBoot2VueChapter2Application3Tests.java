package io.github.futurewl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot2VueChapter2Application3Tests {

	@Autowired
	Book book;

	@Test
	public void contextLoads() {
		System.out.println(book);
	}

}
