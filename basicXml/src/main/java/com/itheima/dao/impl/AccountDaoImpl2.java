package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;

import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

public class AccountDaoImpl2 implements AccountDao {
    public String[] getMystrs() {
        return mystrs;
    }

    public void setMystrs(String[] mystrs) {
        this.mystrs = mystrs;
    }

    public Set<String> getMyset() {
        return myset;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public Properties getMypros() {
        return mypros;
    }

    public void setMypros(Properties mypros) {
        this.mypros = mypros;
    }

    private String[] mystrs;
    private Set<String> myset;
    private Properties mypros;
    public void saveAccount() {
        System.out.println(Arrays.toString(mystrs));
    }

}
