package LearningJavaDay0803._16字节流的使用;
/*
    字节流复制的思想:
           字节是计算机中的一切文件的组成,所以
           字节流适合做一切文件的复制
           复制是把源文件的全部字节一字不漏的转移到目标文件,只要文件前后的格式一样,绝对不会有问题.

     需求:
         源文件
         目标文件

      分析步骤:
          1.创建一个字节输入流管道与源文件接通
          2.创建一个字节输出流与目标文件接通
          3.创建一个字节数组作为桶
          4.从字节输入流管道中读取数据,写出到字节输出流管道即可.
          5.关闭资源

     JDK1.7之后的释放资源的新技术
     try(is=new FileInputStream("");
            os= new FileOutputStream("");//不是常量){
     }
    catch


 */




import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream("");
            os= new FileOutputStream("");

            byte[] buffer=new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("结束");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.flush();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }







    }





}
