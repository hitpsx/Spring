package com.itheima.ui;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;

public class client {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService) ac.getBean("accountservice", IAccountService.class);
//        List<Account> a = as.findAccount();
//        for(int i=0;i<a.size();i++);
//        {
//            System.out.println(a.get(0));
//        }
//        Account b = as.findOneById(1);
//        System.out.println(b.getName());

        Account c=new Account();
        c.setId(1);
        c.setName("hello");
        as.updateAccount(c);
        //获取核心容器对象
        /**
         * ApplicationContext的三个常用实现类
         *      ClassPathXmlApplicationContext：加载类路劲下的配置文件，必须在配置文件下
         *      FileSystemXmlApplicationContext:加载磁盘任意路径下 的配置文件(必须有访问权限)
         *      AnnotationConfigApplicationContext:加载注解类的配置文件
         *
         * 核心容器的两个接口引发的问题
         *   ApplicationContext：立即加载  (适用对象：单例)  一般使用此方法
         *
         *   BeanFactory：需要的时候才创建  (适用对象：多例)
         */
       // ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取Bean对象

        //IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");
       // AccountDao ad = (AccountDao) ac.getBean("accountDao");
        //as .saveAccount();
        //--------------beanFactory----------------
//        Resource resource=new ClassPathResource("bean.xml");a
//        BeanFactory bean=new XmlBeanFactory(resource);
//        AccountDaoImpl as=(AccountDaoImpl) bean.getBean("accountDaoImpl");
//        as.saveAccount();
//        AccountDao ac=(AccountDao) bean.getBean("accountDao2");
//        ac.saveAccount();
    }
}
