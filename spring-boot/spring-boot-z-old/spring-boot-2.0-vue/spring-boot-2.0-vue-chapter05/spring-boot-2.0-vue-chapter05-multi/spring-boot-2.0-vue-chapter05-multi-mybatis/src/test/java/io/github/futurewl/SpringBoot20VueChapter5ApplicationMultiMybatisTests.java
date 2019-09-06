package io.github.futurewl;

import org.junit.Test;
import org.junit.runner.RunWith;
import io.github.futurewl.mapper1.BookMapper;
import io.github.futurewl.mapper2.BookMapper2;
import io.github.futurewl.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot20VueChapter5ApplicationMultiMybatisTests {

	@Autowired
	BookMapper bookMapper;

	@Autowired
	BookMapper2 bookMapper2;

	@Test
	public void contextLoads() {
		List<Book> allBooks = bookMapper.getAllBooks();
		System.out.println(allBooks);
		System.out.println(bookMapper2.getAllBooks());
	}

}
