package LearningCode0901.Demo;

import LearningCode0901.dao.impl.UserDaoImp1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
bean标签:id:唯一性标识,不允许重复 scope:指对象的作用范围
        class:
 */

public class Test {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");//客户端代码
        UserDaoImp1 userDao = (UserDaoImp1) app.getBean("UserDao");
        userDao.save();
    }
}
