package com.itheima;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 单元测试
 */
public class AccountServiceTest {
    @Test
    public void test2()
    {
        //ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as=ac.getBean("accountservice",IAccountService.class);
        List<Account> a = as.findAccount();
        for(int i=0;i<a.size();i++);
        {
            System.out.println(a.get(0));
        }
    }


    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService) ac.getBean("accountservice", IAccountService.class);
        List<Account> a = as.findAccount();
        for(int i=0;i<a.size();i++);
        {
            System.out.println(a.get(0));
        }
        Account b = as.findOneById(1);
        System.out.println(b.getName());

        Account c=new Account();
        c.setId(1);
        c.setName("hello");
        as.updateAccount(c);
       // as.saveAccount(c);

//        Account d=new Account();
//        d.setId(1);
//        d.setName("sas");
//        as.deleteAccoutn(d);

    }

}
