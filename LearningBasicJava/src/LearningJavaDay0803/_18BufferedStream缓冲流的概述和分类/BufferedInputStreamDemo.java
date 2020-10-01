package LearningJavaDay0803._18BufferedStream缓冲流的概述和分类;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;

/*
     字节缓冲输入流
       作用:可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道
           从而提高字节输入流读数据的性能

        --构造器:public BufferedInputStream(InputStream in):
        --原理:缓冲字节输入流管道包装了低级的字节输入流管道以后就自带一个缓冲池,池是内存的一块区域,一次可以直接提取8KB
              到内存,之后程序直接在内存的缓冲池中读取数据,性能是很快的.


 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream is= new FileInputStream("");

            BufferedInputStream bis=new BufferedInputStream(is);//包装
            byte[] buffer=new byte[1024];
            int len ;





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
