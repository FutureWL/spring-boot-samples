package io.github.futurewl.spring.config.web;

import io.github.futurewl.dao.AccountDao;
import io.github.futurewl.entity.Account;
import org.beetl.sql.core.db.KeyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:45
 * @version 1.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountDao accountDao;

    @Autowired
    public AccountController(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @GetMapping(value = "/list")
    public List<Account> getAccounts() {
        return accountDao.all();
    }

    @GetMapping(value = "/{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        return accountDao.unique(id);
    }

    @GetMapping
    public Account getAccountById(@RequestParam("name") String name) {
        return accountDao.selectAccountByName(name);
    }

    @PutMapping(value = "/{id}")
    public String updateAccount(@PathVariable("id") int id,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = accountDao.updateById(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    @PostMapping
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        KeyHolder t = accountDao.insertReturnKey(account);
        if (t.getInt() > 0) {
            return account.toString();
        } else {
            return "fail";
        }
    }
}
