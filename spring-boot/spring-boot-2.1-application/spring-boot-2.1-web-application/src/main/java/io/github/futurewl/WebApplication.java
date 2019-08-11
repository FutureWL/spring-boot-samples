package io.github.futurewl;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RestController
@SpringBootApplication
public class WebApplication {

    @PostMapping("/upload")
    public void update(MultipartFile file) {
        System.out.println("上传文件了");
        System.out.println(file.getName());
    }


    @GetMapping("/login")
    public void login(String code) throws IOException {
        System.out.println(code);

        String appid = "wx6925e487460e9254";
        String secret = "a744239de0ff43bafa3f022433ad27f6";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code")
                .get()
                .build();
        Response response;
        response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }


    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
