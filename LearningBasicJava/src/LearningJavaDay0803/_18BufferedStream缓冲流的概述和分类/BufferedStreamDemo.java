package LearningJavaDay0803._18BufferedStream缓冲流的概述和分类;



import java.io.*;

/*
                    字节流                                                         字符流
        字节输入流                  字节输出流                           字符输入流             字符输出流
   BufferedInputStream        BufferedOutStream                 BufferedReader           BufferedWriter(实现类)

   什么是缓冲流:缓冲流可以提高字节流和字符流的读写数据的能力

   四类缓冲流:
      1.BufferedInputStream:字节缓冲输入流,可以提高自己输入流读数据的性能
      2.BufferedOutStream:字节缓冲输出流,可以提高字节输出流写数据的能力
      3.BufferedReader:字符缓冲输入流,可以提高字符输入流读数据的能力
      4.BufferedWriter:字符缓冲输出流,可以提高字符输出数据的能力

    字符输入转换流InputStreamReader:
       --作用:可以把原始的字节流按照当前默认的代码编码转换成字符输入流
             可以把原始的字节流按照指定编码转换成字符输入流
       --构造器:
          public InputStreamReader(InputStream is):可以使用当前代码默认编码转换成字符流,几乎不用
          public InputStreamReader(InputStream is,String charset):可以指定编码把字符

     字符输出转换流OutputStreamWriter:
       --构造器:
          public OutputStreamWriter(OutputStream os):
          public OutputStreamWriter(OutputStream os,String charset)


      打印流PrintStream:
         作用:可以方便,快速的写数据出去
             可以实现打印啥出去,就是啥出去
         --构造器
            public PrintStream(OutStream os):
            public PrintStream(String filepath):



 */
public class BufferedStreamDemo {
    public static void main(String[] args) {
        InputStream is= null;//原始字节流
        try {
            is = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //把原始字节流准换成字符输入流
        try {
            Reader isr=new InputStreamReader(is,"UTF_8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
