import org.junit.Test;
import web.LoginDemo.Dao.UserDao;
import web.LoginDemo.domain.User;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User user=new User();
        user.setUsername("zzsanshi");
        user.setPassword("1232");
        UserDao dao=new UserDao();
        User u1=dao.login(user);
        System.out.println(u1);
    }
}
