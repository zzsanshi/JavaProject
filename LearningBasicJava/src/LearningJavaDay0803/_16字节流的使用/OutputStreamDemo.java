package LearningJavaDay0803._16字节流的使用;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//b.FileOutputStream 文件字节输出流:
//        ---构造器:
//        1.public FileOutputStream(File file):创建一个字节输出流管道通向目标文件对象
//        2.public FileOutputStream(String file):创建一个字节输出流管道通向目标文件路径
//        3.public FileOutputStream(File file,boolean append):创建一个追加数据的自己输出流
//        4.public FileOutputStream(String file,boolean append):创建一个追加数据的字节输出,true是追加
//        ---方法:
//        1.public void write(int a):写一个字节出去
//        2.public void write(byte[] buffer):写一个字节数组出去
//        3.public void write(byte[] buffer,int pos,int len):写一个字节数组的一部分出去
//        参数一,字节数组;参数二,起始字节索引位置;参数三,写多少个字节数出去
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/11");//创建一个字节管道与文件联通
        os.write(52);//写文件
        os.flush();//刷新数据到文件,管道可以继续使用
        os.close();//关闭字节流管道
    }
}
