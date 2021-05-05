package web.LoginDemo.Servlet;



import org.apache.commons.beanutils.BeanUtils;
import web.LoginDemo.Dao.UserDao;
import web.LoginDemo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");
//        //获取请求参数
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        //封装
//        User loginuser = new User();
//        loginuser.setUsername(username);
//        loginuser.setPassword(password);

        //2.一次获取
        Map<String, String[]> map = req.getParameterMap();
        //创建user对象
        User loginuser = new User();
        try {
            BeanUtils.populate(loginuser,map);//简化数据封装
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //调用dao
        UserDao dao = new UserDao();
        User user = dao.login(loginuser);
        //判断
        if (user == null) {
            //System.out.println("fail");
            req.getRequestDispatcher("/failServlet").forward(req, resp);
        } else {
            //System.out.println("success");
            req.setAttribute("user", user);
            req.getRequestDispatcher("/successServlet").forward(req, resp);
        }
    }
}
