package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
        String uesrname = request.getParameter("username");
        String password = request.getParameter("password");
        String checkcode = request.getParameter("checkCode");
        //判读验证码
        HttpSession session = request.getSession();
        String checkCode = (String) session.getAttribute("check");
        session.removeAttribute("check");
        if (checkCode!=null&&checkCode.equalsIgnoreCase(checkcode)) {
         if("zzsanshi".equals(uesrname)){
             request.getRequestDispatcher("/login.jsp").forward(request, response);

         }
         else{
             request.setAttribute("login_erroe", "密码错误");
             request.getRequestDispatcher("/login.jsp").forward(request, response);
         }


        } else {
            request.setAttribute("error", "验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
