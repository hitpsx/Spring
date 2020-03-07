package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 注解：
 * 1.用于创建对象的，作用和在xml配置文件中编写一个bean标签实现的功能是一样的
 * @component
 *  作用：用于把当前类对象存入spring容器中
 *  属性：
 *      value：相当于id,不写时默认值是当前类名,首字母小写
 * @Controller(表现层)、@Service(服务层)、@Repository(持久层)
 *  作用：与Component作用一样,这三个是spring框架为我们提供的明确的三层使用函数
 *  属性：
 *      value：相当于id,不写时默认值是当前类名,首字母小写

 * 2.用于注入数据:作用和在bean标签中写property是一样的
 *      AutoWired
 *          作用：自动按照类型注入.只要容器中有唯一的bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          出现位置：可以是变量、方法
 *          细节：使用注解进行注入的时候,set方法不是必须的
 *      Qualifier:
 *          作用：按照类中注入的基础上再按照名称注入.它在给类成员注入时不能单独使用，给方法参数注入时可以
 *          属性：value,指定ID
 *      Resource:
 *          作用：直接按照bean的id注入，可以独立使用
 *          属性：
 *              name:用于指定bean的id
 *       以上三个注入只能注入其他bean类型的数据，基本类型无法通关注解实现
 *
 *       Value：
 *          作用：用于注入基本类型和String类型：
 *          属性：value 用于指定数据的值
 * 3.用于改变作用范围的类型与scope
 *      Scope
 *          作用：用于指定Bean的范围
 *          属性：
 *              value：sington   prototype 默认单例
 * 4.用于生命周期的：和bean标签中的init-method和destroy-method的作用是一样的
 *      PreDestroy:指定销毁方法
 *      PostConstruct：指定初始化方法
 */


/**
 * 账户的实现类
 */
//@Service
public class AccountServiceImpl implements IAccountService {
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Autowired
    private AccountDao accountDao;
//    public void saveAccount() {
//      //  String name = "hello";
//        Date  date=new Date();
//        accountDao.saveAccount();
//    }

    @Override
    public List<Account> findAccount() {
        return accountDao.findAccount();
    }

    @Override
    public Account findOneById(Integer id) {
        return accountDao.findOneById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccoutn(Account account) {
        accountDao.deleteAccoutn(account);
    }
}
