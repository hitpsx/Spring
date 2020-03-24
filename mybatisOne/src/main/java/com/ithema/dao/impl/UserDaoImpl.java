package com.ithema.dao.impl;

import com.ithema.dao.IUserDao;
import com.ithema.domain.Account;
import com.ithema.domain.Qv;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory)
    {
        this.factory=factory;
    }
    @Override
    public List<Account> findAll() {
        //1.根据factory获取session对象
        SqlSession session=factory.openSession();
        //2.调用session的方法，实现查询列表
        List<Account> ac=session.selectList("com.ithema.dao.IUserDao.findAll");
        return  ac;
    }

    @Override
    public void saveUser(Account account) {

    }

    @Override
    public void deleteAccount(Integer id) {

    }

    @Override
    public List<Account> findQvo(Qv query) {
        return null;
    }
}
