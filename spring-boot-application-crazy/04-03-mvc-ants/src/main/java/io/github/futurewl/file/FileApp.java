package io.github.futurewl.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@SpringBootApplication
@Controller
public class FileApp {

    public static void main(String[] args) {
        SpringApplication.run(FileApp.class, args);
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file)
            throws IOException {
        byte[] content = file.getBytes();
        System.out.println(content);
        return "success";
    }
}
