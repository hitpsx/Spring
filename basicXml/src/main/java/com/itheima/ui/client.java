package com.itheima.ui;

import com.itheima.dao.AccountDao;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {
    public static void main(String[] args) {
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
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取Bean对象

//        IAccountService as = (IAccountService) ac.getBean("accountService");
//        AccountDao ad = (AccountDao) ac.getBean("accountDao");
//        ad.saveAccount();
        //--------------beanFactory----------------
        Resource resource=new ClassPathResource("bean.xml");
        BeanFactory bean=new XmlBeanFactory(resource);
        IAccountService ac=(IAccountService) bean.getBean("accountService");
        ac.saveAccount();

    }
}
