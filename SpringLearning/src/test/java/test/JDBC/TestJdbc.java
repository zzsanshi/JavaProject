package test.JDBC;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class TestJdbc {
    @Test
    //测试jdbc模板的快速入门的开发步骤
    public void test1() throws PropertyVetoException {
        //创建数据源对象
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        //dataSource.setDriverClass("com.sqlite.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:sqlite:D:\\Database\\username.db");
        //创建模板对象
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);//设置数据源对象,告诉数据位置
        //int row=jdbcTemplate.update("insert into account values(?,?)"," T1",4);//更新,放回行数
        //System.out.println("行数:"+row);
        //jdbcTemplate.query();//查询

    }
    @Test
    //spring产生jdbc模板对象
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("DataSource.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        //int row = jdbcTemplate.update("insert into account values(?,?)", " T7", 6);
        jdbcTemplate.update("update account set money=? where name=?", 8, "T1");//更新操作
        jdbcTemplate.update("delete from account where name=?", "T1");//删除操作

    }
}
