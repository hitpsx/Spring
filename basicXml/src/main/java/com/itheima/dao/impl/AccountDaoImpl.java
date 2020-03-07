package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * 账户的持久层实现类
 */
//@Repository("account")
public class AccountDaoImpl implements AccountDao {

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    private QueryRunner runner;

    @Override
    public List<Account> findAccount()  {
        try{
            return runner.query("select * from test",new BeanListHandler<Account>(Account.class));
        }catch (SQLException e)
        {
            throw  new RuntimeException(e);
        }
    }

    @Override
    public Account findOneById(Integer id) {
        try{
            return  runner.query("select * from test where id =?",new BeanHandler<Account>(Account.class),id);
        }catch (SQLException e)
        {
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void saveAccount(Account account) {
        try{
            runner.update("insert into test(id,name) values(?,?)",account.getId(),account.getName());
        }catch (SQLException e)
        {
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("hello");
        try{
            System.out.println("hello");
            runner.update("update test set name=? where id=?",account.getName(),account.getId());
        }catch (SQLException e)
        {
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccoutn(Account account) {
        System.out.println("hello");
        try{
            runner.update("delete test where id=?",account.getId());
        }catch (SQLException e)
        {
            throw  new RuntimeException(e);
        }
    }
}
