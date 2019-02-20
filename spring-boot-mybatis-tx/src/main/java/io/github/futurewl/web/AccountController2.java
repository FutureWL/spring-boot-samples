package io.github.futurewl.web;

import io.github.futurewl.service.AccountService2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:14:27
 * @version 1.0
 */
@RestController
@RequestMapping("/account")
@MapperScan("io.github.futurewl.dao")
public class AccountController2 {

    private final AccountService2 accountService;

    @Autowired
    public AccountController2(AccountService2 accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "transfer")
    public void transfer() {
        accountService.transfer();
    }

}