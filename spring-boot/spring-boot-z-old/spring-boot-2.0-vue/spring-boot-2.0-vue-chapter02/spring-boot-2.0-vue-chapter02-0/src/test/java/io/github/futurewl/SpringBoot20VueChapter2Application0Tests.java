package io.github.futurewl;

import io.github.futurewl.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot20VueChapter2Application0Tests {

    @Autowired
    Book book;
    @Test
    public void contextLoads() {
        System.out.println(book);
    }

}
