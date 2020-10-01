package LearningJavaDay0803._18BufferedStream缓冲流的概述和分类;



import java.io.*;

/*
    字符缓冲输入流
      --作用:字符缓冲输入流可以把字符输入流包装成一个高级的缓冲字符输入流,
             可以提高字符输入流读数据的性能
      --构造器:public BufferedReader(Reader reader):
      --原理:缓冲字符输入流默认会有一个8K的字符缓冲池,可以提高读字符的性能
      --缓冲字符输入流除了提高了字符输入流的读数据性能,还多了一个按照行读取数据的功能
        public String readLine():读取一行数据返回,读取完毕返回null

 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            Reader fr = new FileReader("");
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while ((line = bfr.readLine()) != null) {//一行一行读
                System.out.println(line);


            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
