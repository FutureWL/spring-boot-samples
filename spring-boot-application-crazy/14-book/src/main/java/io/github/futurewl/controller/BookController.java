package io.github.futurewl.controller;

import io.github.futurewl.BookApp;
import io.github.futurewl.WebMvcConfig;
import io.github.futurewl.entity.Book;
import io.github.futurewl.demo1.service.BookService;
import io.github.futurewl.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public String list(Model model,
                       @PageableDefault(size = BookApp.PAGE_SIZE) Pageable pageable) {
        model.addAttribute("datas", bookService.findAll(pageable));
        return "book/list";
    }

    /**
     * 打开添加页面
     *
     * @return
     */
    @GetMapping("/add")
    public String add(@ModelAttribute Book book) {
        return "book/content";
    }

    /**
     * 打开修改界面
     */
    @GetMapping("/edit/{bookId}")
    public String edit(@PathVariable Integer bookId, @ModelAttribute Book book,
                       Model model) {
        model.addAttribute("book", bookService.findById(bookId));
        return "book/content";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute Book book) throws IOException {
        bookService.save(book);
        return "redirect:/book/list";
    }

    /**
     * 打开查看界面
     */
    @GetMapping("/view/{bookId}")
    public String view(@PathVariable Integer bookId, Model model) {
        model.addAttribute("book", bookService.findById(bookId));
        model.addAttribute("readonly", true);
        return "book/content";
    }

    @RequestMapping("/delete/{page}")
    public String delete(@RequestParam Integer[] ids, @PathVariable Integer page) {
        bookService.delete(ids);
        return "redirect:/book/list?page=" + page;
    }

    @RequestMapping("/upload")
    public void upload(@RequestParam("cover") MultipartFile uploadFile,
                       HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        byte[] content = uploadFile.getBytes();
        // 保存文件到具体目录，此处为D:/book/upload
        String path = WebMvcConfig.FILE_DIR;
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        // 获取文件后缀
        String fileSuffix = FileUtil
                .getSuffix(uploadFile.getOriginalFilename());
        // 设置文件名
        File file = new File(folder.getAbsolutePath() + File.separator
                + UUID.randomUUID().toString() + fileSuffix);
        file.createNewFile();
        // 写到服务器文件
        FileUtil.writeFile(file, content);
        response.getWriter().write("/upload/" + file.getName());
    }

    /**
     * 打开选择书本界面
     *
     * @return
     */
    @GetMapping("/choose")
    public String choose(Model model,
                         @PageableDefault(size = BookApp.PAGE_SIZE) Pageable pageable) {
        model.addAttribute("datas", bookService.findAll(pageable));
        return "book/choose";
    }

    @GetMapping("/test")
    public String testFindAll(Model model, Pageable pageable) {
        model.addAttribute("datas", bookService.testFindAll(pageable));
        return "book/test";
    }
}
