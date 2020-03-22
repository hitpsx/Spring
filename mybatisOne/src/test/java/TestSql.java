import com.ithema.dao.IUserDao;
import com.ithema.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSql {

    @Test
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session=factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao=session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法

        Account as=new Account();
        as.setId(3);
        as.setName("test");
        userDao.saveUser(as);
        List<Account> ac=userDao.findAll();
        for(Account account : ac)
        {
            System.out.println(account);
        }
        userDao.deleteAccount(3);
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }
}
