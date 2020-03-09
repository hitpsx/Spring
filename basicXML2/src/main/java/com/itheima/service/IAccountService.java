package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层
 */

public interface IAccountService {
    List<Account> findAccount();
    Account findOneById(Integer id);
    void  saveAccount(Account account);
    void  updateAccount(Account account);
    void deleteAccoutn(Account account);
}
