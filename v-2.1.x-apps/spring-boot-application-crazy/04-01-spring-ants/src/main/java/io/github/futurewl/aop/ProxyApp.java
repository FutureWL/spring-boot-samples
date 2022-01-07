package io.github.futurewl.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProxyApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProxyApp.class).properties(
                "spring.aop.proxy-target-class=false").run(args);
    }

    @Autowired
    SaleServiceImpl saleService;

    @GetMapping("/sale")
    public String saleService() {
        saleService.saleService();
        System.out.println("SaleServiceImpl的class: " + saleService.getClass());
        return "";
    }

    @Autowired
    MerService merService;

    @GetMapping("/mer")
    public String merService() {
        merService.merService();
        System.out.println("MerService的class: " + merService.getClass());
        return "";
    }
}
