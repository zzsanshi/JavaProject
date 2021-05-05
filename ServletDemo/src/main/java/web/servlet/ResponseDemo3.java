package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("定向成功!");
        //设置默认编码
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type","text/html;charaset=utf-8");//告诉浏览器,服务器发送的消息体
        resp.setContentType("text/html;charaset=utf-8");
        PrintWriter writer=resp.getWriter();//获取字符输出流
        writer.write("<h1>你好 response</h1>");//输出数据

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
