package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class SimpleApp {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApp.class, args);
    }

    @GetMapping("/simple")
    public String simple() {
        return "simple";
    }

    @GetMapping("/select")
    public String select() {
        return "select";
    }

    @GetMapping("/event")
    public String event() {
        return "event";
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }

    @GetMapping("/ajax")
    public String ajax() {
        return "ajax";
    }

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book("1", "疯狂工作流讲义", "杨恩雄");
        Book b2 = new Book("2", "疯狂Spring Cloud微服务架构实战", "杨恩雄");
        books.add(b1);
        books.add(b2);
        return books;
    }

    @GetMapping("/post")
    public String post() {
        return "post";
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Book save(@RequestBody Book book) throws Exception {
        System.out.println("接收的数据：" + book.getId() + "-" + book.getName() + "-"
                + book.getAuthor());
        return book;
    }

    @GetMapping("/validate")
    public String validate() {
        return "validate";
    }
}