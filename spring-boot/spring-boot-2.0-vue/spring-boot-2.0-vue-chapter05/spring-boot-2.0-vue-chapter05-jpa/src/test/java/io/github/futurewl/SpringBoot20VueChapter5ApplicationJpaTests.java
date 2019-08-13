package io.github.futurewl;

import org.junit.Test;
import org.junit.runner.RunWith;
import io.github.futurewl.dao.BookDao;
import io.github.futurewl.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot20VueChapter5ApplicationJpaTests {

	@Autowired
	BookDao bookDao;
	@Test
	public void contextLoads() {
		List<Book> all = bookDao.findAll();
		System.out.println(all);
		List<Book> booksByIdAndName = bookDao.getBooksByIdAndName("三", 10);
		System.out.println(booksByIdAndName);
	}
}
