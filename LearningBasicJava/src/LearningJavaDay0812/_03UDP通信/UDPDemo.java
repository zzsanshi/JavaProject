package LearningJavaDay0812._03UDP通信;
/*
   UDP协议的特点:
      面向无连接协议
      发送端只管发送,不确认对方是否收到
      基于数据包进行数据传输
      发送数据的包的大小限制64KB以内
      因为面向无连接,速度快,但是可靠.会丢失数据

   使用场景:
      在线视频
      网络语音电话

    两个类
    1.DatagramPacket
       数据包对象
       作用:用来封装要发送或要接受的数据,比如:集装箱
    2.DatagramSocket
       发送对象
       作用:用来发送或接受数据包,比如码头

    DatagramPacket类:
       发送端用:
          DatagramPacket(byte[] buf,int length,InetAddress address,int port)
           创建发送端数据对象
          buf:要发送的内容,字节数组
          length:要发送内容的长度,单位是字节
          address:接收端的IP地址对象
          port:接收端的端口号

       接受端用:
          DatagramPacket(byte[] buf ,int length)
          创建接收端的数据包对象
          buf:用来存储接收到的内容
          length:能够接受内容的长度

       常用方法:
       int getLength() 获得实际接受到的字节个数


    DatagramSocket类:
       构造方法:
          DatagramSocket() 创建发送端的Socket对象,系统会随机分配一个端口号
          DatagramSocket(int port) 创建接收端的Socket对象并指定端口号

        成员方法:
          void send(DatagramSocket dp)发送数据包
          void receive(DatagramSocket p)接受数据包


      需求:使用UDP实现客户端发,服务端收

 */
public class UDPDemo {
}
