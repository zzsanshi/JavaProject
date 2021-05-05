package web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width=100;
        int height=50;
        System.out.println("验证码");
        //创建一个对象在内存中画图(验证码图片对象)
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //美化图片
        Graphics g=image.getGraphics();//画笔对象
        g.setColor(Color.pink);//设置颜色
        g.fillRect(0,0,width,height);//背景色
        g.setColor(Color.blue);
        g.drawRect(0,0,width-1,height-1);
        //写验证码
        String str="ABCDE";
        //随机类
        Random ran=new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <=4 ; i++) {
            int idx=ran.nextInt(str.length());
            char ch=str.charAt(idx);
            sb.append(ch);
            g.setColor(Color.blue);
            g.drawString(ch+"",20*i,25);
        }
        String check=sb.toString();

        req.getSession().setAttribute("check",check);
         //画干扰线
        g.setColor(Color.green);
        //随机生成坐标点
        for (int i = 1; i <10 ; i++) {
            int x1=ran.nextInt(width);
            int x2=ran.nextInt(width);
            int y1=ran.nextInt(height);
            int y2=ran.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }



        //输出图片
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
