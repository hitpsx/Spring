package com.ithema.dao.impl;

import com.ithema.dao.IUserDao;
import com.ithema.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class IUserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;
    public IUserDaoImpl(SqlSessionFactory factory)
    {
        this.factory=factory;
    }
    public List<Account> findAll() {
        SqlSession session=factory.openSession();
        List<Account> ac=session.selectList("com.ithema.dao.IUserDao.findAll");
        session.close();
        return ac;
    }

    public void saveUser(Account account) {
        SqlSession session=factory.openSession();
        session.insert("com.ithema.dao.IUserDao.saveUser",account);
    }

    public void deleteAccount(Integer id) {

    }
}
