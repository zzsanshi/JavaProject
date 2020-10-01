package LearningJavaDay0803._17字符流的使用;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
   字符输入流    字符输出流
    Reader      Writer    (抽象类)
    FileReader  FileWriter(实现类)

    FileReader:文件字符输入流
      --构造器:
        public FileReader(File file):创建一个字符输入流与源文件对象接通
        public FileReader(String filePath):创建一个字符输入流与源文件路径接通

      --方法:
        public int read():读取一个字符的编号返回!读取完毕返回-1
        public int read(char[] buffer):读取一个字符数组,读取多少个字符就返回多少个数量,读取完毕返回-1.
    小节:字符流一个一个字符的读取,可以很好的解决问题.

 */
public class FileReadDemo {
    public static void main(String[] args) {
        try {
            Reader fr = new FileReader("");
            char code = (char) fr.read();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
