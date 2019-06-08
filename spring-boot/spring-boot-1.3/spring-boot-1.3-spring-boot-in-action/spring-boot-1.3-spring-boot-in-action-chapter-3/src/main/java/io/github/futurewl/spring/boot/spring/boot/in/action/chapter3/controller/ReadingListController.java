package io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.controller;

import io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.entity.Book;
import io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.entity.Reader;
import io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.properties.AmazonProperties;
import io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:15:52
 * @version 1.0
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;

    @Autowired
    private AmazonProperties amazonProperties;

    @RequestMapping(method = RequestMethod.GET)
    public String readersBooks(Reader reader, Model model) {
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
            model.addAttribute("reader", reader);
            model.addAttribute("amazonID", amazonProperties.getAssociateId());
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/readingList/{reader}";
    }

}
