package com.itheima.dao;

import com.itheima.domain.Account;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;


public interface AccountDao {
    List<Account> findAccount();
    Account findOneById(Integer id);
    void  saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccoutn(Account account);
}
