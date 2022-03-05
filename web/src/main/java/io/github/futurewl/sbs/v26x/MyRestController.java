package io.github.futurewl.sbs.v26x;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myrest")
public class MyRestController {


    @GetMapping("/myget")
    public String myget() {
        return "myget";
    }

    @GetMapping("/mygetparam")
    public String myget(String myparam) {
        return "myget param:" + myparam;
    }

}
