//package com.itheima.dao.impl;
//
//import com.itheima.dao.AccountDao;
//import org.springframework.stereotype.Repository;
//
//import java.util.Date;
//
//@Repository("account1")
//public class AccountDaoImpl3 implements AccountDao {
//    public AccountDaoImpl() {
//        this.name=name;
//        this.date=date;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    //变化的数据不适用于注入的方式
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    private Date date;
//
//    public void saveAccount() {
//        System.out.println("hello1");
//    }
//
//}
