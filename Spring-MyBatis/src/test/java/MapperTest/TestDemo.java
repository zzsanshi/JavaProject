package MapperTest;

import Learning.User;
import Learning.dao.UserMapper;
import Learning.mapper.UserMapper2;
import Learning.mapper.UserMapper3;
import Learning.mapper.UserMapper4;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    private UserMapper4 mapper;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper4.class);

    }
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper2 mapper1 = sqlSession.getMapper(UserMapper2.class);
        User condition=new User();
        condition.setId(0);
        condition.setUsername("zz");
        condition.setPassword("1234");
//        List<User> user=mapper.findByCondition(condition);
        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        List<User> user=mapper1.findByIds(ids);
        System.out.println(user);
    }
    @Test
    public void test2(){
        User user=new User();
        user.setUsername("lucky");
        user.setPassword("123dd");
        mapper.save(user);

    }
}
