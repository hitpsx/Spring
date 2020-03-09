package config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfiguration {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;
    @Bean(name = "runner")
    public QueryRunner createQueryRunner(DataSource dataSource)
    {
        return new QueryRunner(dataSource);
    }
    @Bean(name = "dataSource")
    public DataSource createDataSource()
    {
        try {
            ComboPooledDataSource ds=new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setUser(user);
            ds.setPassword(password);
            ds.setJdbcUrl(url);
            return ds;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
