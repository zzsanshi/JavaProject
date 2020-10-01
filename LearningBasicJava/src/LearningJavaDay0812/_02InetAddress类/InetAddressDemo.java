package LearningJavaDay0812._02InetAddress类;

import java.net.InetAddress;



/*
     InetAddress:
       static InetAddress getLocalHost()--获得本机IP地址对象
       Static InetAddress getByName(String host)--根据IP地址字符串或主机名获得对应的IP地址对象
       String getHostName()--获得主机名
       String getHostAddress()--获得IP地址字符串

 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ip = null;

        ip = InetAddress.getLocalHost();

        System.out.println(ip.getHostName());





    }


}
