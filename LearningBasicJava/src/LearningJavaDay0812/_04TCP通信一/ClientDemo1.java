package LearningJavaDay0812._04TCP通信一;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/*
     TCP (Transfer Control Protocol) 传输控制协议
     特点:
        面向连接的协议
        只能由客户端主动发送数据给服务端,服务器端接受到数据之后,可以给客户端响应数据
        通过三次握手建立连接,连接成功形成数据传输通道
        通过四次挥手断开连接
        基于IO流进行数据传输
        传输数据大小没有限制
        因为面向连接的协议,速度慢,但是是可靠的协议

     使用场景:
          文件上传和下载
          邮件发送和接收
          远程登录

     相关类:
         socket--一个该类的对象代表一个客户端程序
         ServerSocket--一个该类的对象就代表一个服务端程序
      TCP也叫Socket网络编程

      Socket类构造方法
         Socket(String host,int port)
         根据ip地址字符串和端口号创建客户端Socket对象
         注意事项:只要执行该方法,就会立即连接指定的服务器程序,如果连接不成功,则会抛出异常

       常用方法:
          OutputStream getOutputStream();获得字节输出流对象
          InputStream getInputStream();获得字节输入流对象

       ServerSocket类构造方法
         public ServerSocket(int port)注册端口
        常用方法:public Socket accept():等待接受一个客户端Socket接受请求,返回一个Socket对象


       客户端开发流程:
           1.客户端要求请求与服务端的socket管道连接
           2.从socket通道中得到一个字节输出流
           3.通过字节输出流给服务端写出数据

        服务端开发流程
           1.注册端口
           2.接收客户端的socket连接
           3.从socket通信管道中得到一个字节输入流
           4.从字节输入流中读取客户端发来的数据

 */
public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",22);

        OutputStream os=socket.getOutputStream();//得到字节输出流

        PrintStream ps=new PrintStream(os);//包装成高级的打印流

        ps.println("nihao!");//发消息
        ps.flush();
        System.out.println("发送成功!");


    }
}
