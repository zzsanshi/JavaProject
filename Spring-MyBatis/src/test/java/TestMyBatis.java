import Learning.User;
import Learning.mapper.UserMapper2;
import Learning.mapper.UserMapper3;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestMyBatis {
    @Test
    public void test1() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream=Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行操作 参数:namespace+id

//        //模拟user对象
//        User user=new User();
//        user.setUsername("Tom1");
//        user.setPassword("123");
//        user.setId(1);
//        sqlSession.insert("userMapper.save",user);
//


//        sqlSession.update("userMapper.update",user);
        //提交事务
//        sqlSession.commit();
        //设置分页相关参数
        PageHelper.startPage(1,3);
        List<User> users=sqlSession.selectList("Learning.dao.UserMapper4.findAll");
        for(User user:users){
            System.out.println(user);
        }
//获得与分页相关参数
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        System.out.println("当前页:"+userPageInfo.getPageNum());
        System.out.println("条数"+userPageInfo.getPageSize());
        sqlSession.close();

    }
    @Test
    public void test2() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper3 mapper = sqlSession.getMapper(UserMapper3.class);
        //执行保存操作
        User user=new User();
        user.setUsername("sanshi");
        user.setPassword("123");
        mapper.save(user);//操作

        sqlSession.commit();
        sqlSession.close();

    }
}
