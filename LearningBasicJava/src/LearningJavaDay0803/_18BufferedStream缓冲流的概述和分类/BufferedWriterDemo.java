package LearningJavaDay0803._18BufferedStream缓冲流的概述和分类;

import java.io.*;

/*
    字符缓冲输出流
    --构造器:public BufferedWriter(Writer writer):
    --字符缓冲输出流除了提高字符输出流写数据的性能,还多了一个换行的特有功能:
       public void newLine():新建一行

 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        Writer fw= null;
        try {
            fw = new FileWriter("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bfw=new BufferedWriter(fw);//封装




    }
}
