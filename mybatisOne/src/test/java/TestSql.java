import com.ithema.dao.IUserDao;
import com.ithema.domain.Account;
import com.ithema.domain.Qv;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSql {
    private IUserDao userDao;
    private SqlSession session;
    private InputStream in;

    public TestSql() throws IOException {
        //1.读取配置文件
        this.in= Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //3.使用工厂生产SqlSession对象
        this.session=factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        this.userDao=session.getMapper(IUserDao.class);
    }
    @After
    public  void close() throws IOException {
        this.session.commit();
        this.session.close();
        this.in.close();
    }

    @Test
    /**
     * 传入pojo对象进行查询
     */
    public   void test1() {
        Qv qv=new Qv();
        Account as=new Account();
        as.setUserID(3);
        as.setUserName("借贷");
        qv.setAccount(as);
        List<Account> ac=userDao.findQvo(qv);
        for(Account account : ac)
        {
            System.out.println(account);
        }
    }

    @Test
    public void  test2 ()
    {
        List<Account> ac=userDao.findAll();
        for(Account account : ac)
        {
            System.out.println(account);
        }
    }
//    @Test
////    public static void main(String[] args) throws IOException {
////        //1.读取配置文件
////        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
////
////        //2.创建SqlSessionFactory工厂
////        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
////        SqlSessionFactory factory=builder.build(in);
////        //3.使用工厂生产SqlSession对象
////        SqlSession session=factory.openSession();
////        //4.使用SqlSession创建Dao接口的代理对象
////        IUserDao userDao=session.getMapper(IUserDao.class);
////        //5.使用代理对象执行方法
////
////        Qv qv=new Qv();
////        Account as=new Account();
////        as.setId(3);
////        as.setName("借贷");
////        qv.setAccount(as);
////
////        List<Account> ac=userDao.findQvo(qv);
////        for(Account account : ac)
////        {
////            System.out.println(account);
////        }
////        userDao.deleteAccount(3);
////        session.commit();
////        //6.释放资源
////        session.close();
////        in.close();
////    }
}
