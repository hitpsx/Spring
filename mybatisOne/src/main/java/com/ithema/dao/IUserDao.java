package com.ithema.dao;

import com.ithema.domain.Account;
import com.ithema.domain.Qv;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 持久层接口类
 */
public interface IUserDao {
    List<Account> findAll();
    void saveUser(Account account);
    void deleteAccount(Integer id);
    List<Account> findQvo(Qv query);

}
