package test.JDBC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:DataSource.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    //测试更新操作
    public void testUpdate() {
//        jdbcTemplate.update("insert into account values(?,?)", " T1", 4);//插入
//        jdbcTemplate.update("update account set money=? where name=?", 2, "who");//更新操作
//        jdbcTemplate.update("delete from account where name=?", "T1");//删除操作

    }
    @Test
    public void testQuery(){
        //查询全部
        List<Account> accountList= jdbcTemplate.query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
        //查询单个对象
        Account account= jdbcTemplate.queryForObject("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),"Tom");
        System.out.println(account);
        //聚合查询
       Long count=jdbcTemplate.queryForObject("select count(*) from account",Long.class);
       System.out.println(count);
    }

}
