package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.stereotype.Component;

import java.util.Date;

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
 * 3.用于改变作用范围的：scope
 * 4.用于生命周期的：和bean标签中的init-method和destroy-method的作用是一样的
 */
@Component
public class AccountServiceImpl implements IAccountService {
    private AccountDao accountDao;
    public void saveAccount() {
      //  String name = "hello";
        Date  date=new Date();
        accountDao.saveAccount();
    }
}
