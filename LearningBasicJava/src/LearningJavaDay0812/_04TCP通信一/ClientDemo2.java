package LearningJavaDay0812._04TCP通信一;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/*
  多个客户端:多线程
   一个管道一个线程
   没接收一个客户端就分配一个线程
 */
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",22);

        OutputStream os=socket.getOutputStream();//得到字节输出流

        PrintStream ps=new PrintStream(os);//包装成高级的打印流

        ps.println("nihao!");//发消息
        ps.flush();
        System.out.println("发送成功!");


    }
}
