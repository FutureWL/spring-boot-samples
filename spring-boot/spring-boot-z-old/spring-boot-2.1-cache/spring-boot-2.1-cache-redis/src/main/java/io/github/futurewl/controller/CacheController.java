package io.github.futurewl.controller;

import io.github.futurewl.entity.Person;
import io.github.futurewl.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:10:54
 * @version 1.0
 */
@RestController
public class CacheController {

    @Autowired
    DemoService demoService;

    @PostMapping("/put")
    public Person put(@RequestBody Person person) {
        return demoService.save(person);
    }

    @GetMapping("/able")
    public Person cacheable(@RequestBody Person person) {
        return demoService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        demoService.remove(id);
        return "ok";
    }

}
