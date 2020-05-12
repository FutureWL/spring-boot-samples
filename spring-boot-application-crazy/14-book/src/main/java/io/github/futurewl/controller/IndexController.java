package io.github.futurewl.controller;

import io.github.futurewl.service.BookService;
import io.github.futurewl.service.BookStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private BookStockService bookStockService;

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/main")
    public String main(Model model) {
        model.addAttribute("books", bookService.findIndexBooks());
        model.addAttribute("stocks", bookStockService.findIndexStocks());
        return "main";
    }
}
