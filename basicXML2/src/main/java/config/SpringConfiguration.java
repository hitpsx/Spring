package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 该类是Spinrg的配置类
 * @Configuration注解
 *      作用：指定当前类是一个配置类
 * @ComponentScan
 *      作用：用于通过注解指定spring再创建容器时要扫描的包
 *      属性:
 *          value:与basePackages作用一样，用于指定创建容器时要扫描的包
 *          使用该注解就等同与在xml中配置了：
 *          <context:component-scan base-package="com.itheima"></context:component-scan>
 * @Bean
 *      作用:用于把当前方法的返回值作为一个bean对象存入Spring的ioc容器中
 *      属性：
 *          name：用于指定bean的ID(默认值是当前方法的名称
 *      细节：
 *          当我们使用注解配置方法的时候，如果方法有参数，spring框架会去容器中查找是否有可用的bean对象
 *          方式与AutoWired一致。
 * @Import
 *      作用：用于导入其他配置类
 *      属性：value 用于指定其他配置类的字节码，用import注解的类就是父配置类
 *
 * @PropertySource
 *      作用：指定文件的名称和路径
 *      属性：
 *          value：指定文件的名称和路径
 *              关键字：classpath表示类路径下
 */

//@Configuration
@ComponentScan(value = "com.itheima")
@Import(JdbcConfiguration.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {


}
