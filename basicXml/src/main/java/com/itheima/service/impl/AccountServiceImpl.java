package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        AccountDao accountDao=new AccountDaoImpl();
        accountDao.saveAccount();
    }
}
