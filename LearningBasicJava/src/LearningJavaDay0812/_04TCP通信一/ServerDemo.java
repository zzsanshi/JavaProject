package LearningJavaDay0812._04TCP通信一;

/*
 ServerSocket类构造方法
         public ServerSocket(int port)注册端口
        常用方法:public Socket accept():等待接受一个客户端Socket接受请求,返回一个Socket对象
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //注册端口
        ServerSocket ss=new ServerSocket(22);
        //接收管道连接
        while (true) {
        Socket socket=ss.accept();
        System.out.println("连接成功!");
        //得到字节输入流
        InputStream is=socket.getInputStream();
        //把字节输入流包装成字符输入流
         Reader isr=new InputStreamReader(is);
         //把字符输入流包装成缓冲字符输入流
        BufferedReader br=new BufferedReader(isr);
        String msg;

            if ((msg = br.readLine()) != null) {
                System.out.println(msg);
                System.out.println("接受成功!");
            }
        }
    }
}
