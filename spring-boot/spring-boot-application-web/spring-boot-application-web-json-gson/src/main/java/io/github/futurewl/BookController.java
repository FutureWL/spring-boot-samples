package io.github.futurewl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @GetMapping("/books")
    @ResponseBody
    public Book books() {
        Book book1 = new Book();
        book1.setId(1);
        book1.setAuthor("罗贯中");
        book1.setName("三国演义");
        return book1;
    }
}
