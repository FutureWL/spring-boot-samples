package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class BootApp {

    public static void main(String[] args) {
        SpringApplication.run(BootApp.class, args);
    }

    @GetMapping("/simple")
    public String simple() {
        return "simple";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("1", "疯狂Spring Cloud", "杨恩雄"));
        books.add(new Book("2", "疯狂工作流讲义", "杨恩雄"));
        model.addAttribute("books", books);
        return "list";
    }

    @GetMapping("/form")
    public String form(@ModelAttribute Book book) {
        return "form";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute Book book) {
        System.out.println("book: " + book.getName() + ", " + book.getAuthor()
                + ", " + book.getPrice());
        return "form";
    }

    @GetMapping("/ajax")
    public String ajax(@ModelAttribute Book book) {
        return "ajax";
    }

    @PostMapping(value = "/ajaxSave")
    public String ajaxSave(@ModelAttribute Book book, Model model) {
        if ("abc".equals(book.getAuthor())) {
            model.addAttribute("msg", "请输入正确的作者名称");
        }
        return "ajax";
    }


    @GetMapping("/page/{currentPage}")
    public String page(@PathVariable int currentPage, Model model) {
        DataPackage datas = findBooks(currentPage);
        model.addAttribute("datas", datas);
        return "page";
    }

    /**
     * 根据当前页查找数据（实际应用中到数据库查找）
     */
    private DataPackage findBooks(int currentPage) {
        DataPackage dp = new DataPackage();
        // 设置数据总数（实际中可到数据库中查询，例如使用select count）
        dp.setDataCount(30);
        dp.setCurrentPage(currentPage);
        // 模拟数据库查询数据
        List<Book> books = new ArrayList<Book>();
        for (int i = ((currentPage - 1) * dp.getPageSize()); i < (currentPage * dp
                .getPageSize()); i++) {
            Book book = new Book(String.valueOf(i), "book-" + i, "杨恩雄");
            books.add(book);
        }
        dp.setDatas(books);
        // 根据数据量等值，计算总页数
        dp.setPageCount();
        return dp;
    }

}