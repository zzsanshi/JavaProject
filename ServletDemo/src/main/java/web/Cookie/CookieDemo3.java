package web.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieDemo3")
public class CookieDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //获取所有cookie
        response.setContentType("text/html;charaset=utf-8");
        Cookie[] cookies=request.getCookies();
        //遍历cookie数组
        if(cookies!=null&&cookies.length>0){
            for (Cookie cookie : cookies) {
                String name=cookie.getName();
                if("lastTime".equals(name)){
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日 ");
                    String str_date=sdf.format(date);
                    cookie.setValue(str_date);
                    cookie.setMaxAge(60);
                    response.addCookie(cookie);
                    String value=cookie.getValue();
                    response.getWriter().write("欢迎回来:"+value);
                    break;

                }
            }
                    
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
