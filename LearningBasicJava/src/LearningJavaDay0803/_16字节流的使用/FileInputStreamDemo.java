package LearningJavaDay0803._16字节流的使用;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*

      a.FileInputStream文件字节输入流:
         ---构造器:
            1.public FileInputStream(File Path):创建一个字节输入流管道与源文件对象接通
            2.public FileInputStream(string pathName):创建一个字节输入流管道与文件路径对接
         ---方法:
            1.public int read():每次读取一个字节返回!读取完毕会返回-1
            2.public int read(byte[] buffer):从字节输入流中读取字节到字节数组中去.返回读取的字节数量,没有字节可读返回-1

      引入:一个一个字节读取中文输出均无法避免输出乱码
      如何避免:1.定义一个字节数组与文件一样大 --readAllBytes
             字节流不适合读取文件内容,建议使用字符流

 */
public class FileInputStreamDemo {

}
