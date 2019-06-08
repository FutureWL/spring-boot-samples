package io.github.futurewl.web;

import io.github.futurewl.dao.AccountDao;
import io.github.futurewl.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:14:27
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
        return accountDao.findAll();
    }

    @GetMapping(value = "/{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        Optional<Account> optionalAccount = accountDao.findById(id);
        return optionalAccount.orElse(null);
    }

    @PutMapping(value = "/{id}")
    public String updateAccount(@PathVariable("id") int id,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        Account account1 = accountDao.saveAndFlush(account);

        return account1.toString();

    }

    @PostMapping
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        Account account1 = accountDao.save(account);
        return account1.toString();

    }


}
